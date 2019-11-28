

package co.paulburke.android.itemtouchhelperdemo.helper;

public interface ItemTouchHelperAdapter {


    boolean onItemMove(int fromPosition, int toPosition);


    void onItemDismiss(int position);
}
