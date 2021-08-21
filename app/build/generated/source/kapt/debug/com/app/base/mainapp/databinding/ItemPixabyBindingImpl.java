package com.app.base.mainapp.databinding;
import com.app.base.mainapp.R;
import com.app.base.mainapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPixabyBindingImpl extends ItemPixabyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_cell, 2);
        sViewsWithIds.put(R.id.rl_top, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPixabyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemPixabyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            );
        ensureBindingComponentIsNotNull(com.app.base.mainapp.base.FragmentBindingAdapters.class);
        this.cardview.setTag(null);
        this.pixabyImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.pixaby == variableId) {
            setPixaby((com.app.base.mainapp.data.source.remote.model.response.PixabyItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPixaby(@Nullable com.app.base.mainapp.data.source.remote.model.response.PixabyItem Pixaby) {
        this.mPixaby = Pixaby;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.pixaby);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.app.base.mainapp.data.source.remote.model.response.PixabyItem pixaby = mPixaby;
        java.lang.String pixabyPreviewUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (pixaby != null) {
                    // read pixaby.previewUrl
                    pixabyPreviewUrl = pixaby.getPreviewUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mBindingComponent.getFragmentBindingAdapters().bindImage(this.pixabyImage, pixabyPreviewUrl, (android.graphics.drawable.Drawable)null);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): pixaby
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}