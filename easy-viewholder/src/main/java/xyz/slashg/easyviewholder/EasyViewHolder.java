package xyz.slashg.easyviewholder;

import android.support.v7.widget.RecyclerView;


/**
 * Simple extension of {@code ViewHolder} that works with
 * {@code AdapterView}.
 *
 * Setting data in the Views become a tad easier using these
 * two in tandem. If the data passed cannot be used by the
 * {@link AdapterView} being used, the {@link AdapterView}
 * implementation can throw an {@link xyz.slashg.easyviewholder.AdapterView.InvalidDataException}.
 *
 * Created by SlashG on 18/11/16.
 */
public class EasyViewHolder extends RecyclerView.ViewHolder
{
	private AdapterView adapterView;

	public EasyViewHolder(AdapterView itemView)
	{
		super(itemView.getView());
		this.adapterView = itemView;
	}

	public AdapterView getAdapterView()
	{
		return adapterView;
	}

	public void setData(Object object) throws AdapterView.InvalidDataException
	{
		adapterView.setData(object);
	}
}
