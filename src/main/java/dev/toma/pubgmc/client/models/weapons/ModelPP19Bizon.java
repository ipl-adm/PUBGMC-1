package dev.toma.pubgmc.client.models.weapons;

import dev.toma.pubgmc.animation_old.HeldAnimation;
import dev.toma.pubgmc.animation_old.HeldAnimation.HeldStyle;
import dev.toma.pubgmc.animation_old.ReloadAnimation;
import dev.toma.pubgmc.animation_old.ReloadAnimation.ReloadStyle;
import dev.toma.pubgmc.client.util.ModelTransformationHelper;
import dev.toma.pubgmc.common.capability.player.PlayerDataProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.item.ItemStack;

public class ModelPP19Bizon extends ModelGun {

    private final ModelRenderer charging_handle;
    private final ModelRenderer magazine;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer pp19;
    private final ModelRenderer bone11;
    private final ModelRenderer bone5;
    private final ModelRenderer bone8;
    private final ModelRenderer bone19;
    private final ModelRenderer bone20;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone12;
    private final ModelRenderer bone18;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer ironsights;
    private final ModelRenderer bone7;
    private final ModelRenderer bone6;
    private final ModelRenderer bone;

    @Override
    public void initAnimations() {
        initAimAnimation(-0.55f, 0.235f, 0.15f);
        initAimingAnimationStates(0.235f, 0.165f, 0.145f);
        heldAnimation = new HeldAnimation(HeldStyle.SMALL);
        reloadAnimation = new ReloadAnimation(magazine, ReloadStyle.MAGAZINE).initMovement(DEFAULT_PART_ANIMATION, 180);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(ItemStack stack, ItemCameraTransforms.TransformType transformType) {
        EntityPlayerSP player = Minecraft.getMinecraft().player;
        if (player != null && player.hasCapability(PlayerDataProvider.PLAYER_DATA, null)) {
            GlStateManager.pushMatrix();
            {
                renderBizon(stack);
            }
            GlStateManager.popMatrix();
        }
    }

    private void renderBizon(ItemStack stack) {
        GlStateManager.pushMatrix();
        {
            GlStateManager.rotate(180F, 0.0F, 1.0F, 0.0F);
            ModelTransformationHelper.defaultSMGTransform();
            GlStateManager.translate(33.05, 2.275001, -38.0);

            pp19.render(1f);
            magazine.render(1f);
            charging_handle.render(1.0F);
            if(!hasScopeAtachment(stack))
                ironsights.render(1f);
        }
        GlStateManager.popMatrix();

        /*this.renderSMGSilencer(0, -9, -41, 1.2F, stack);
        this.renderRedDot(1.025, -0.725, 0, 1f, stack);
        this.renderHolo(0.275, -0.175, -2, 1f, stack);
        this.renderScope2X(0, 0, 0, 1.0F, stack);
        this.renderScope4X(0, -5, -5, 1.2F, stack);*/
    }

    public ModelPP19Bizon() {
        textureWidth = 512;
        textureHeight = 512;

        charging_handle = new ModelRenderer(this);
        charging_handle.setRotationPoint(0.0F, 24.0F, 0.0F);
        charging_handle.cubeList.add(new ModelBox(charging_handle, 44, 42, -4.864F, -18.366F, 18.812F, 1, 2, 2, 0.0F, false));
        charging_handle.cubeList.add(new ModelBox(charging_handle, 44, 42, -4.164F, -17.866F, 19.312F, 1, 1, 1, 0.0F, false));

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(0.0F, 22.9F, 0.0F);


        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
        magazine.addChild(bone2);
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -1.0F, 8.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -1.0F, 20.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -1.0F, 32.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -0.7F, 44.5F, 3, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -0.7F, 7.5F, 3, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -2.0F, 45.5F, 3, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -2.0F, 6.5F, 3, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.1962F, 8.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -2.5F, -13.5242F, 20.5F, 5, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -2.5F, -13.5242F, 8.5F, 5, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 1.5F, -13.5242F, 9.5F, 1, 3, 11, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.5F, -14.4202F, 9.5F, 3, 3, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.5F, -14.4202F, 12.5F, 3, 3, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -0.5F, -14.4202F, 16.5F, 1, 3, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.5F, -13.4202F, 16.5F, 3, 1, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.0F, -13.9202F, 16.5F, 2, 2, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -0.5F, -13.4202F, 19.4F, 1, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -0.7F, -14.2202F, 11.5F, 2, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -0.7F, -13.6202F, 11.5F, 2, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.3F, -14.2202F, 11.5F, 2, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 6, 497, -1.3F, -13.6202F, 11.5F, 2, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -2.5F, -13.5242F, 9.5F, 1, 3, 11, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.1962F, 20.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.1962F, 32.5F, 3, 1, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.4962F, 44.5F, 3, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.4962F, 7.5F, 3, 1, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.1962F, 45.5F, 3, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -1.5F, -11.1962F, 6.5F, 3, 2, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -4.0F, -9.6562F, 45.308F, 8, 8, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -4.0F, -9.6562F, 6.692F, 8, 8, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.5981F, -7.0981F, 8.5F, 1, 3, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.5981F, -7.0981F, 20.5F, 1, 3, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.5981F, -7.0981F, 32.5F, 1, 3, 12, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.8981F, -7.0981F, 44.5F, 1, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.8981F, -7.0981F, 7.5F, 1, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 3.5981F, -7.0981F, 45.5F, 2, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 3.5981F, -7.0981F, 6.5F, 2, 3, 1, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.5981F, -7.0981F, 8.5F, 1, 3, 12, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 9.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 9.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 27.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 27.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 15.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 15.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 33.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 33.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 21.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 21.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 39.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 39.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 12.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 12.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 30.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 30.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 18.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 18.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 36.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 36.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 24.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 24.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.7981F, -6.5981F, 42.0F, 1, 2, 2, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, 4.7981F, -6.5981F, 42.0F, 1, 2, 2, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.5981F, -7.0981F, 20.5F, 1, 3, 12, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.5981F, -7.0981F, 32.5F, 1, 3, 12, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.8981F, -7.0981F, 44.5F, 1, 3, 1, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.8981F, -7.0981F, 7.5F, 1, 3, 1, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.5981F, -7.0981F, 45.5F, 2, 3, 1, 0.0F, true));
        bone2.cubeList.add(new ModelBox(bone2, 81, 85, -5.5981F, -7.0981F, 6.5F, 2, 3, 1, 0.0F, true));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        magazine.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, -0.5236F);
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -0.25F, 8.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -0.25F, 20.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -0.25F, 32.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, 0.05F, 44.5F, 3, 1, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, 0.05F, 7.5F, 3, 1, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -1.25F, 45.5F, 3, 2, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -1.25F, 6.5F, 3, 2, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.4462F, 8.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.4462F, 20.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.4462F, 32.5F, 3, 1, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.7462F, 44.5F, 3, 1, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.7462F, 7.5F, 3, 1, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.4462F, 45.5F, 3, 2, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 1.299F, -10.4462F, 6.5F, 3, 2, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -2.799F, -6.3481F, 8.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -2.799F, -6.3481F, 20.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -2.799F, -6.3481F, 32.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -3.099F, -6.3481F, 44.5F, 1, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -3.099F, -6.3481F, 7.5F, 1, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -2.799F, -6.3481F, 45.5F, 2, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, -2.799F, -6.3481F, 6.5F, 2, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 7.3971F, -6.3481F, 8.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 7.3971F, -6.3481F, 20.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 7.3971F, -6.3481F, 32.5F, 1, 3, 12, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 7.6971F, -6.3481F, 44.5F, 1, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 7.6971F, -6.3481F, 7.5F, 1, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 6.3971F, -6.3481F, 45.5F, 2, 3, 1, 0.0F, true));
        bone4.cubeList.add(new ModelBox(bone4, 81, 85, 6.3971F, -6.3481F, 6.5F, 2, 3, 1, 0.0F, true));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
        magazine.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, 0.5236F);
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -0.25F, 8.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -0.25F, 20.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -0.25F, 32.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, 0.05F, 44.5F, 3, 1, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, 0.05F, 7.5F, 3, 1, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -1.25F, 45.5F, 3, 2, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -1.25F, 6.5F, 3, 2, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.4462F, 8.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.4462F, 20.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.4462F, 32.5F, 3, 1, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.7462F, 44.5F, 3, 1, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.7462F, 7.5F, 3, 1, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.4462F, 45.5F, 3, 2, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -4.299F, -10.4462F, 6.5F, 3, 2, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 1.799F, -6.3481F, 8.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 1.799F, -6.3481F, 20.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 1.799F, -6.3481F, 32.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 2.099F, -6.3481F, 44.5F, 1, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 2.099F, -6.3481F, 7.5F, 1, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 0.799F, -6.3481F, 45.5F, 2, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, 0.799F, -6.3481F, 6.5F, 2, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.3971F, -6.3481F, 8.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.3971F, -6.3481F, 20.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.3971F, -6.3481F, 32.5F, 1, 3, 12, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.6971F, -6.3481F, 44.5F, 1, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.6971F, -6.3481F, 7.5F, 1, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.3971F, -6.3481F, 45.5F, 2, 3, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 81, 85, -8.3971F, -6.3481F, 6.5F, 2, 3, 1, 0.0F, false));

        pp19 = new ModelRenderer(this);
        pp19.setRotationPoint(0.0F, 24.0F, 0.0F);
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -16.0F, 10.632F, 1, 3, 10, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -16.0F, 7.632F, 2, 3, 3, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -16.0F, 5.632F, 6, 3, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -14.0F, -7.368F, 6, 2, 13, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -1.5F, -13.0F, 4.832F, 3, 5, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -1.5F, -8.4F, 1.232F, 3, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -1.5F, -8.7F, -2.768F, 3, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -2.5F, -14.0F, 22.632F, 5, 1, 10, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -2.5F, -14.0F, 32.632F, 5, 1, 11, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -2.5F, -14.5F, 43.632F, 5, 1, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -2.5F, -15.0F, 45.632F, 5, 1, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -17.3F, 22.632F, 2, 2, 24, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -17.3F, 46.632F, 2, 2, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -17.8F, 51.632F, 3, 3, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -17.8F, 57.632F, 1, 3, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -17.8F, 57.632F, 1, 3, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -0.5F, -17.8F, 57.632F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -0.5F, -17.8F, 54.632F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -16.8F, 54.632F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -16.8F, 54.632F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -17.8F, 52.632F, 1, 1, 5, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -17.8F, 57.832F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -17.8F, 52.632F, 1, 1, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -17.8F, 57.832F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -0.5F, -15.8F, 57.632F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -0.5F, -15.8F, 54.632F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -15.8F, 52.632F, 1, 1, 5, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -15.8F, 57.832F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -15.8F, 52.632F, 1, 1, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, 0.5F, -15.8F, 57.832F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -20.012F, 22.632F, 2, 2, 24, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -20.012F, 46.632F, 2, 2, 3, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -21.3F, 49.632F, 2, 4, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.5F, -21.3F, 50.632F, 3, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -19.3F, 51.232F, 2, 2, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 12, -1.0F, -20.3F, 51.032F, 2, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -1.0F, -14.464F, 44.04F, 2, 2, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -17.866F, 42.632F, 1, 3, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -17.866F, 42.632F, 1, 3, 5, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -17.866F, 32.632F, 1, 4, 6, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -17.866F, 32.632F, 1, 4, 6, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -17.866F, 22.632F, 1, 4, 6, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -17.866F, 22.632F, 1, 4, 6, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -17.866F, 38.632F, 1, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 6, -2.5F, -19.866F, 22.632F, 1, 2, 25, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 66, 6, 1.5F, -19.866F, 22.632F, 1, 2, 25, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 6, -1.134F, -21.2321F, 22.632F, 2, 1, 25, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 66, 6, 0.134F, -21.2321F, 22.632F, 1, 1, 25, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -17.866F, 38.632F, 1, 1, 4, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -17.866F, 28.632F, 1, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -17.866F, 28.632F, 1, 1, 4, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -14.866F, 38.632F, 1, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -14.866F, 38.632F, 1, 1, 4, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.0F, -14.866F, 28.632F, 1, 1, 4, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -14.866F, 28.632F, 1, 1, 4, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -2.5F, -19.0F, 20.632F, 5, 6, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 81, 27, -3.5F, -19.866F, 17.632F, 7, 1, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 81, 27, -3.0F, -21.866F, 17.632F, 6, 2, 5, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.5F, -16.866F, 6.632F, 1, 3, 16, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.5F, -15.866F, 6.632F, 1, 2, 16, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.5F, -18.866F, 6.632F, 1, 2, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.5F, -18.866F, -7.368F, 1, 5, 14, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 0, 86, -3.0F, -19.166F, -7.868F, 6, 6, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 0, 86, -1.5F, -17.7183F, -31.8451F, 3, 11, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -3.5F, -19.074F, 12.232F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -3.5F, -19.074F, 5.232F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -3.5F, -19.074F, -1.768F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 2.5F, -19.074F, 12.232F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 2.5F, -19.074F, 5.232F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 2.5F, -19.074F, -1.768F, 1, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 0.4F, -20.566F, -6.368F, 1, 1, 24, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 0.4F, -20.774F, 12.232F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 0.4F, -20.774F, 5.232F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, 0.4F, -20.774F, -1.768F, 1, 1, 1, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -1.4F, -20.566F, -6.368F, 2, 1, 24, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -1.4F, -20.774F, 12.232F, 2, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -1.4F, -20.774F, 5.232F, 2, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 87, 18, -1.4F, -20.774F, -1.768F, 2, 1, 1, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.5F, -18.866F, 6.632F, 1, 3, 2, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.5F, -18.866F, -7.368F, 1, 5, 14, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.5F, -18.866F, 18.632F, 1, 3, 4, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 5, 72, 2.228F, -17.866F, 8.632F, 1, 2, 10, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 0, 7, -3.164F, -17.866F, 7.632F, 1, 1, 13, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.5F, -18.866F, 20.632F, 1, 2, 2, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, -3.5F, -18.866F, 7.632F, 1, 1, 13, 0.0F, false));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.5F, -18.866F, 8.632F, 1, 1, 10, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 1.0F, -16.0F, 7.632F, 2, 3, 3, 0.0F, true));
        pp19.cubeList.add(new ModelBox(pp19, 79, 5, 2.0F, -16.0F, 10.632F, 1, 3, 10, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(0.0F, 0.0F, -1.6F);
        pp19.addChild(bone11);
        setRotationAngle(bone11, -0.1745F, 0.0F, 0.0F);
        bone11.cubeList.add(new ModelBox(bone11, 79, 5, -2.0F, -12.0F, -7.368F, 5, 10, 6, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
        pp19.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -0.5236F);
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 3.9019F, -13.7583F, -7.368F, 1, 1, 30, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 6.4019F, -18.0885F, -7.368F, 1, 1, 25, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 6.5059F, -18.2686F, 12.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 6.5059F, -18.2686F, 5.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 6.5059F, -18.2686F, -1.768F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 8.0706F, -18.5107F, -6.368F, 1, 1, 24, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 8.1746F, -18.6908F, 12.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 8.1746F, -18.6908F, 5.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 8.1746F, -18.6908F, -1.768F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 10.9954F, -16.2447F, -6.368F, 1, 1, 24, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 11.0994F, -16.4248F, 12.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 11.0994F, -16.4248F, 5.232F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 87, 18, 11.0994F, -16.4248F, -1.768F, 1, 1, 1, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 4.3349F, -13.5083F, 22.632F, 1, 1, 20, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 4.8349F, -14.3744F, 42.632F, 1, 1, 5, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 11.0981F, -16.9545F, 22.632F, 1, 1, 25, 0.0F, true));
        bone5.cubeList.add(new ModelBox(bone5, 64, 10, 8.634F, -18.9545F, 22.632F, 1, 1, 25, 0.0F, true));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
        pp19.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.0F, 0.5236F);
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -4.9019F, -13.7583F, -7.368F, 1, 1, 30, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -7.4019F, -18.0885F, -7.368F, 1, 1, 25, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -7.5059F, -18.2686F, 12.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -7.5059F, -18.2686F, 5.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -7.5059F, -18.2686F, -1.768F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -11.9954F, -16.2447F, -6.368F, 1, 1, 24, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -12.0994F, -16.4248F, 12.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -12.0994F, -16.4248F, 5.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -12.0994F, -16.4248F, -1.768F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -9.0706F, -18.5107F, -6.368F, 1, 1, 24, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -9.1746F, -18.6908F, 12.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -9.1746F, -18.6908F, 5.232F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 87, 18, -9.1746F, -18.6908F, -1.768F, 1, 1, 1, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -5.3349F, -13.5083F, 22.632F, 1, 1, 20, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -5.8349F, -14.3744F, 42.632F, 1, 1, 5, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -12.0981F, -16.9545F, 22.632F, 1, 1, 25, 0.0F, false));
        bone8.cubeList.add(new ModelBox(bone8, 64, 10, -9.634F, -18.9545F, 22.632F, 1, 1, 25, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(0.0F, -18.766F, -7.868F);
        pp19.addChild(bone19);
        setRotationAngle(bone19, 0.0437F, 0.0F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 0, 86, -1.5F, 0.0F, -24.0F, 3, 2, 24, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(0.0F, -18.766F, -7.868F);
        pp19.addChild(bone20);
        setRotationAngle(bone20, 0.3054F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 0, 86, -1.5F, 2.8814F, -24.5828F, 3, 2, 24, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-0.4F, -19.566F, -6.868F);
        pp19.addChild(bone9);
        setRotationAngle(bone9, 0.6981F, 0.0F, 0.0F);
        bone9.cubeList.add(new ModelBox(bone9, 0, 86, -1.1F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-0.4F, -18.866F, -6.868F);
        pp19.addChild(bone10);
        setRotationAngle(bone10, 0.6981F, 0.0F, 0.0F);
        bone10.cubeList.add(new ModelBox(bone10, 79, 5, -2.6F, -0.5823F, -0.0981F, 6, 1, 1, 0.0F, true));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(0.4F, 1.96F, -11.1F);
        pp19.addChild(bone12);
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 5.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 15.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 7.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 17.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 9.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 19.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 11.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 21.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 13.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 23.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.4F, -24.474F, 25.232F, 2, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 6.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 16.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 8.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 18.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 10.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 20.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 12.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 22.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 14.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -2.266F, -23.974F, 24.232F, 2, 0, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 6.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 16.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 8.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 18.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 10.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 20.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 12.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 22.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 14.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -0.534F, -23.974F, 24.232F, 2, 0, 1, 0.0F, false));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.9F, -23.774F, 5.232F, 3, 1, 10, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -4.5F, -21.274F, 12.232F, 1, 2, 4, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 18, 178, -4.588F, -20.118F, 12.432F, 1, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 18, 178, -4.588F, -20.118F, 15.032F, 1, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -4.5F, -19.5669F, 14.5249F, 1, 1, 1, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -4.5F, -19.5669F, 12.9391F, 1, 1, 2, 0.0F, true));
        bone12.cubeList.add(new ModelBox(bone12, 98, 98, -1.9F, -23.774F, 15.232F, 3, 1, 11, 0.0F, true));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(-4.4F, -20.274F, 14.232F);
        bone12.addChild(bone18);
        setRotationAngle(bone18, 0.7854F, 0.0F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 98, 98, -0.1F, -0.7071F, -2.1213F, 1, 1, 1, 0.0F, true));
        bone18.cubeList.add(new ModelBox(bone18, 98, 98, -0.1F, 1.1213F, -0.2929F, 1, 1, 1, 0.0F, true));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-4.4F, -22.274F, 14.232F);
        bone12.addChild(bone15);
        setRotationAngle(bone15, 0.0F, 0.0F, 0.7854F);
        bone15.cubeList.add(new ModelBox(bone15, 98, 98, 0.6364F, -3.2222F, -1.0F, 1, 3, 2, 0.0F, true));
        bone15.cubeList.add(new ModelBox(bone15, 98, 98, 0.6364F, -0.2222F, -2.0F, 1, 1, 4, 0.0F, true));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(0.8536F, -0.9393F, 0.0F);
        bone15.addChild(bone16);
        setRotationAngle(bone16, 0.5236F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 98, 98, -0.2172F, -0.3789F, 0.3735F, 1, 2, 1, 0.0F, true));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(0.8536F, -0.9393F, -6.264F);
        bone15.addChild(bone17);
        setRotationAngle(bone17, -0.5236F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 98, 98, -0.2172F, -3.5109F, 4.0513F, 1, 2, 1, 0.0F, true));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(-0.4F, -24.274F, 5.732F);
        bone12.addChild(bone13);
        setRotationAngle(bone13, 0.0F, 0.0F, 0.5236F);
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, -0.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 9.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 1.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 11.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 3.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 13.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 5.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 15.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 7.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 17.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 0.766F, -0.6732F, 19.5F, 1, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 0.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 10.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 2.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 12.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 4.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 14.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 6.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 16.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 8.5F, 0, 1, 1, 0.0F, true));
        bone13.cubeList.add(new ModelBox(bone13, 98, 98, 1.766F, -0.6732F, 18.5F, 0, 1, 1, 0.0F, true));

        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(-0.4F, -24.274F, 5.732F);
        bone12.addChild(bone14);
        setRotationAngle(bone14, 0.0F, 0.0F, -0.5236F);
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, -0.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 9.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 1.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 11.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 3.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 13.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 5.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 15.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 7.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 17.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 19.5F, 1, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 0.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 10.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 2.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 12.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 4.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 14.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 6.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 16.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 8.5F, 0, 1, 1, 0.0F, false));
        bone14.cubeList.add(new ModelBox(bone14, 98, 98, -1.766F, -0.6732F, 18.5F, 0, 1, 1, 0.0F, false));

        ironsights = new ModelRenderer(this);
        ironsights.setRotationPoint(-2.0F, 24.0F, 0.0F);
        ironsights.cubeList.add(new ModelBox(ironsights, 66, 12, 1.0F, -23.3F, 49.632F, 2, 2, 2, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 3.0F, -25.096F, 16.3306F, 1, 2, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 0.0F, -25.096F, 16.3306F, 1, 2, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 0.0F, -23.696F, 16.3306F, 4, 1, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 0.116F, -23.19F, 17.744F, 1, 2, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 0.5F, -23.366F, 21.216F, 3, 2, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 2.884F, -23.19F, 17.744F, 1, 2, 1, 0.0F, true));
        ironsights.cubeList.add(new ModelBox(ironsights, 81, 27, 0.5F, -23.296F, 16.4266F, 3, 1, 1, 0.0F, false));
        ironsights.cubeList.add(new ModelBox(ironsights, 66, 12, 0.134F, -24.366F, 49.632F, 1, 1, 2, 0.0F, true));
        ironsights.cubeList.add(new ModelBox(ironsights, 66, 12, 2.866F, -24.366F, 49.632F, 1, 1, 2, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(2.0F, -20.8F, 55.632F);
        ironsights.addChild(bone7);
        setRotationAngle(bone7, 0.0F, 0.0F, 0.5236F);
        bone7.cubeList.add(new ModelBox(bone7, 66, 12, -2.183F, -2.049F, -6.0F, 1, 1, 2, 0.0F, true));
        bone7.cubeList.add(new ModelBox(bone7, 66, 12, -0.817F, -3.4151F, -6.0F, 1, 1, 2, 0.0F, true));
        bone7.cubeList.add(new ModelBox(bone7, 66, 12, -0.982F, -3.7009F, -39.3014F, 1, 1, 1, 0.0F, true));
        bone7.cubeList.add(new ModelBox(bone7, 66, 12, -2.3388F, -2.451F, -39.3014F, 1, 1, 1, 0.0F, true));
        bone7.cubeList.add(new ModelBox(bone7, 66, 12, -0.667F, -3.1553F, -6.0F, 1, 2, 2, 0.0F, true));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(2.0F, -20.8F, 55.632F);
        ironsights.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, -0.5236F);
        bone6.cubeList.add(new ModelBox(bone6, 66, 12, 1.183F, -2.049F, -6.0F, 1, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 66, 12, -0.333F, -3.1553F, -6.0F, 1, 2, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 66, 12, -0.183F, -3.4151F, -6.0F, 1, 1, 2, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 66, 12, -0.018F, -3.7009F, -39.3014F, 1, 1, 1, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 66, 12, 1.3388F, -2.451F, -39.3014F, 1, 1, 1, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(2.0F, -22.814F, 17.316F);
        ironsights.addChild(bone);
        setRotationAngle(bone, -0.1222F, 0.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 43, 48, -1.0F, -0.7437F, -0.5149F, 2, 1, 5, 0.0F, false));
        this.initAnimations();
    }
}
