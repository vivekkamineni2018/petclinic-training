package com.atlas.client.extension.petclinic.view.pet;

import com.antheminc.oss.nimbus.domain.defn.Domain;
import com.antheminc.oss.nimbus.domain.defn.Domain.ListenerType;
import com.antheminc.oss.nimbus.domain.defn.MapsTo;
import com.antheminc.oss.nimbus.domain.defn.Repo;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.Page;
import com.antheminc.oss.nimbus.domain.defn.ViewConfig.ViewRoot;
import com.antheminc.oss.nimbus.domain.defn.extension.Content.Label;
import com.atlas.client.extension.petclinic.core.Pet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Swetha Vemuri
 *
 */
@Domain(value = "petview", includeListeners = { ListenerType.websocket })
@MapsTo.Type(Pet.class)
@Repo(value=Repo.Database.rep_none, cache=Repo.Cache.rep_device)
@Getter @Setter @ToString(callSuper = true)
@ViewRoot(layout = "home")
public class VRPet {
	
	@Label("Pets")
	@Page(route="petview")
	private VPAllPets vpAllPets;
	
	@Label("Add/Edit Pet")
	@Page(route="petview")
	private VPAddEditPet vpAddEditPet;
	
	@Label("Pet Info")
	@Page(route="petview")
	private VPPetInfo vpPetInfo;	
}
