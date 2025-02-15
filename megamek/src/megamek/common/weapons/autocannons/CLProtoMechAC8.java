package megamek.common.weapons.autocannons;

import megamek.common.SimpleTechLevel;

/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Oct 2, 2004
 *
 */

/**
 * @author Jason Tighe
 */
public class CLProtoMechAC8 extends ProtoMechACWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 4371171653960292873L;

    /**
     *
     */
    public CLProtoMechAC8() {
        super();

        name = "ProtoMech AC/8";
        setInternalName("CLProtoMechAC8");
        addLookupName("Clan ProtoMech AC/8");
        heat = 2;
        damage = 8;
        rackSize = 8;
        minimumRange = 0;
        shortRange = 3;
        mediumRange = 7;
        longRange = 10;
        extremeRange = 14;
        tonnage = 5.5;
        criticals = 4;
        bv = 66;
        cost = 175000;
        shortAV = 7;
        medAV = 7;
        longAV = 7;
        maxRange = RANGE_SHORT;
        explosionDamage = damage;
        rulesRefs = "286,TO";
        techAdvancement.setTechBase(TECH_BASE_CLAN)
            .setTechRating(RATING_F).setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setClanAdvancement(3070, 3073, 3145).setClanApproximate(true, true, false)
            .setPrototypeFactions(F_CBS).setProductionFactions(F_CBS)
            .setStaticTechLevel(SimpleTechLevel.ADVANCED);
    }
}
