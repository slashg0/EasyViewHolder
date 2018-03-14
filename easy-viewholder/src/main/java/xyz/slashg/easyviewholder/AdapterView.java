package xyz.slashg.easyviewholder;

import android.support.annotation.Nullable;
import android.view.View;

/**
 * An interface to be implemented in the {@link View} class that
 * is to be bound using {@link EasyViewHolder}. This provides a
 * minor simplification in the process of Adapter integration, as
 * the setting of data is unified.
 *
 * Created by SlashG on 14/11/16.
 */
public interface AdapterView
{
	void setData(Object object) throws InvalidDataException;
	View getView();

	class InvalidDataException extends Exception
	{
		public InvalidDataException(@Nullable String message)
		{
			super(message);
		}
	}

}
