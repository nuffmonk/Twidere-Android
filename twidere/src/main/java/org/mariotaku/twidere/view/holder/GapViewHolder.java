/*
 * Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2014 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.view.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;

import org.mariotaku.twidere.adapter.iface.IGapSupportedAdapter;

/**
 * Created by mariotaku on 14/12/3.
 */
public class GapViewHolder extends RecyclerView.ViewHolder implements OnClickListener {

    private final IGapSupportedAdapter adapter;

    public GapViewHolder(IGapSupportedAdapter adapter, View itemView) {
        super(itemView);
        this.adapter = adapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        final IGapSupportedAdapter.GapClickListener listener = adapter.getGapClickListener();
        if (listener == null) return;
        listener.onGapClick(this, getLayoutPosition());
    }
}
