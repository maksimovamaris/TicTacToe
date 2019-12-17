package com.example.tictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;



public class WinnerView extends  FrameLayout
{
    private Paint mPaint=new Paint();

//    public WinnerView(Context context) {
//        super(context);
//    }

    public WinnerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public WinnerView(Context context) {
        this(context, null);
    }
//    public WinnerView(Context context, @Nullable AttributeSet attrs)
//    {
//        super(context, attrs);
//        init(context);
//    }

        //  public WinnerView(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }

//    public WinnerView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }

    private void init(Context context)
    {
        View.inflate(context,R.layout.winner_view,this);
    }
//    @Override
//    public void onDraw(Context context){
//
//    }
//    @Override
//    public boolean shouldDelayChildPressedState() {
//        return false;
//    }
//    @Override
//    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
//        final int count = getChildCount();

        // These are the far left and right edges in which we are performing layout.
//        int leftPos = getPaddingLeft();
//        int rightPos = right - left - getPaddingRight();
//
//        // This is the middle region inside of the gutter.
//
////        final int middleLeft = leftPos + mLeftWidth;
////        final int middleRight = rightPos - mRightWidth;
//
//        // These are the top and bottom edges in which we are performing layout.
//        final int parentTop = getPaddingTop();
//        final int parentBottom = bottom - top - getPaddingBottom();
//
//        for (int i = 0; i < count; i++) {
//            final View child = getChildAt(i);
//            if (child.getVisibility() != GONE) {
//                final LayoutParams lp = (LayoutParams) child.getLayoutParams();
//
//                final int width = child.getMeasuredWidth();
//                final int height = child.getMeasuredHeight();
//
//                // Compute the frame in which we are placing this child.
//                if (lp.position == LayoutParams.POSITION_LEFT) {
//                    mTmpContainerRect.left = leftPos + lp.leftMargin;
//                    mTmpContainerRect.right = leftPos + width + lp.rightMargin;
//                    leftPos = mTmpContainerRect.right;
//                } else if (lp.position == LayoutParams.POSITION_RIGHT) {
//                    mTmpContainerRect.right = rightPos - lp.rightMargin;
//                    mTmpContainerRect.left = rightPos - width - lp.leftMargin;
//                    rightPos = mTmpContainerRect.left;
//                } else {
//                    mTmpContainerRect.left = middleLeft + lp.leftMargin;
//                    mTmpContainerRect.right = middleRight - lp.rightMargin;
//                }
//                mTmpContainerRect.top = parentTop + lp.topMargin;
//                mTmpContainerRect.bottom = parentBottom - lp.bottomMargin;
//
//                // Use the child's gravity and size to determine its final
//                // frame within its container.
//                Gravity.apply(lp.gravity, width, height, mTmpContainerRect, mTmpChildRect);
//
//                // Place the child.
//                child.layout(mTmpChildRect.left, mTmpChildRect.top,
//                        mTmpChildRect.right, mTmpChildRect.bottom);
//            }
//        }
//    }

    // ----------------------------------------------------------------------
    // The rest of the implementation is for custom per-child layout parameters.
    // If you do not need these (for example you are writing a layout manager
    // that does fixed positioning of its children), you can drop all of this.

//    @Override
//    public LayoutParams generateLayoutParams(AttributeSet attrs) {
//        return new CustomLayout.LayoutParams(getContext(), attrs);
//    }

    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

//    @Override
//    protected void onLayout(boolean changed, int l, int t, int r, int b) {
//
//    }

    /**
     * Custom per-child layout information.
     */
//    public static class LayoutParams extends MarginLayoutParams {
        /**
         * The gravity to apply with the View to which these layout parameters
         * are associated.
         */
//        public int gravity = Gravity.TOP | Gravity.START;
//
//        public static int POSITION_MIDDLE = 0;
//        public static int POSITION_LEFT = 1;
//        public static int POSITION_RIGHT = 2;
//
//        public int position = POSITION_MIDDLE;
//
//        public LayoutParams(Context c, AttributeSet attrs) {
//            super(c, attrs);
//
//            // Pull the layout param values from the layout XML during
//            // inflation.  This is not needed if you don't care about
//            // changing the layout behavior in XML.
//            TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.CustomLayoutLP);
//            gravity = a.getInt(R.styleable.CustomLayoutLP_android_layout_gravity, gravity);
//            position = a.getInt(R.styleable.CustomLayoutLP_layout_position, position);
//            a.recycle();
//        }
//
//        public LayoutParams(int width, int height) {
//            super(width, height);
//        }
//
//        public LayoutParams(ViewGroup.LayoutParams source) {
//            super(source);
//        }
//    }


}
