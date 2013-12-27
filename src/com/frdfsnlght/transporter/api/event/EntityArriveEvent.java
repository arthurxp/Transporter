/*
 * Copyright 2012 frdfsnlght <frdfsnlght@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.frdfsnlght.transporter.api.event;

import com.frdfsnlght.transporter.api.Reservation;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Fired when an entity arrives from a teleport.
 *
 * @author frdfsnlght <frdfsnlght@gmail.com>
 */
public final class EntityArriveEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    /**
     * Returns the list of event handlers for this event.
     *
     * @return the list of event handlers for this event
     */
    public static HandlerList getHandlerList() {
        return handlers;
    }

    private Reservation reservation;

    /**
     * Creates the event.
     *
     * @param reservation   the reservation used for teleportation
     */
    public EntityArriveEvent(Reservation reservation) {
        this.reservation = reservation;
    }

    /**
     * Returns the reservation used for teleporation.
     *
     * @return the reservation used for teleporation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Returns the list of event handlers for this event.
     *
     * @return the list of event handlers for this event
     */
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

}
