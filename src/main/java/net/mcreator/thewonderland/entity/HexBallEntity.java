
package net.mcreator.thewonderland.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class HexBallEntity extends AbstractArrow implements ItemSupplier {

	public HexBallEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(TheWonderlandModEntities.HEX_BALL.get(), world);
	}

	public HexBallEntity(EntityType<? extends HexBallEntity> type, Level world) {
		super(type, world);
	}

	public HexBallEntity(EntityType<? extends HexBallEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public HexBallEntity(EntityType<? extends HexBallEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(TheWonderlandModBlocks.CANDY_GRASS_BLOCK.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();

		if (this.inGround)
			this.discard();
	}

	public static HexBallEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		HexBallEntity entityarrow = new HexBallEntity(TheWonderlandModEntities.HEX_BALL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);

		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast_far")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));

		return entityarrow;
	}

	public static HexBallEntity shoot(LivingEntity entity, LivingEntity target) {
		HexBallEntity entityarrow = new HexBallEntity(TheWonderlandModEntities.HEX_BALL.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);

		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(10);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entityarrow.setSecondsOnFire(100);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.blast_far")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));

		return entityarrow;
	}

}
