/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.xpande.pluscons.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for Z_GPC_AttachConfRem
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_GPC_AttachConfRem extends PO implements I_Z_GPC_AttachConfRem, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20201102L;

    /** Standard Constructor */
    public X_Z_GPC_AttachConfRem (Properties ctx, int Z_GPC_AttachConfRem_ID, String trxName)
    {
      super (ctx, Z_GPC_AttachConfRem_ID, trxName);
      /** if (Z_GPC_AttachConfRem_ID == 0)
        {
			setEMail (null);
			setFolder (null);
			setZ_GPC_AttachConf_ID (0);
			setZ_GPC_AttachConfRem_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_GPC_AttachConfRem (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_Z_GPC_AttachConfRem[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_Value (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	/** Set Folder.
		@param Folder 
		A folder on a local or remote system to store data into
	  */
	public void setFolder (String Folder)
	{
		set_Value (COLUMNNAME_Folder, Folder);
	}

	/** Get Folder.
		@return A folder on a local or remote system to store data into
	  */
	public String getFolder () 
	{
		return (String)get_Value(COLUMNNAME_Folder);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}

	public I_Z_GPC_AttachConf getZ_GPC_AttachConf() throws RuntimeException
    {
		return (I_Z_GPC_AttachConf)MTable.get(getCtx(), I_Z_GPC_AttachConf.Table_Name)
			.getPO(getZ_GPC_AttachConf_ID(), get_TrxName());	}

	/** Set Z_GPC_AttachConf ID.
		@param Z_GPC_AttachConf_ID Z_GPC_AttachConf ID	  */
	public void setZ_GPC_AttachConf_ID (int Z_GPC_AttachConf_ID)
	{
		if (Z_GPC_AttachConf_ID < 1) 
			set_Value (COLUMNNAME_Z_GPC_AttachConf_ID, null);
		else 
			set_Value (COLUMNNAME_Z_GPC_AttachConf_ID, Integer.valueOf(Z_GPC_AttachConf_ID));
	}

	/** Get Z_GPC_AttachConf ID.
		@return Z_GPC_AttachConf ID	  */
	public int getZ_GPC_AttachConf_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_GPC_AttachConf_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Z_GPC_AttachConfRem ID.
		@param Z_GPC_AttachConfRem_ID Z_GPC_AttachConfRem ID	  */
	public void setZ_GPC_AttachConfRem_ID (int Z_GPC_AttachConfRem_ID)
	{
		if (Z_GPC_AttachConfRem_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_GPC_AttachConfRem_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_GPC_AttachConfRem_ID, Integer.valueOf(Z_GPC_AttachConfRem_ID));
	}

	/** Get Z_GPC_AttachConfRem ID.
		@return Z_GPC_AttachConfRem ID	  */
	public int getZ_GPC_AttachConfRem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Z_GPC_AttachConfRem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}