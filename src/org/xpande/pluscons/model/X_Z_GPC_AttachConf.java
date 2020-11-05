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

/** Generated Model for Z_GPC_AttachConf
 *  @author Adempiere (generated) 
 *  @version Release 3.9.0 - $Id$ */
public class X_Z_GPC_AttachConf extends PO implements I_Z_GPC_AttachConf, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20201102L;

    /** Standard Constructor */
    public X_Z_GPC_AttachConf (Properties ctx, int Z_GPC_AttachConf_ID, String trxName)
    {
      super (ctx, Z_GPC_AttachConf_ID, trxName);
      /** if (Z_GPC_AttachConf_ID == 0)
        {
			setValue (null);
			setZ_GPC_AttachConf_ID (0);
        } */
    }

    /** Load Constructor */
    public X_Z_GPC_AttachConf (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_Z_GPC_AttachConf[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_EMailConfig getAD_EMailConfig() throws RuntimeException
    {
		return (I_AD_EMailConfig)MTable.get(getCtx(), I_AD_EMailConfig.Table_Name)
			.getPO(getAD_EMailConfig_ID(), get_TrxName());	}

	/** Set EMail Configuration.
		@param AD_EMailConfig_ID EMail Configuration	  */
	public void setAD_EMailConfig_ID (int AD_EMailConfig_ID)
	{
		if (AD_EMailConfig_ID < 1) 
			set_Value (COLUMNNAME_AD_EMailConfig_ID, null);
		else 
			set_Value (COLUMNNAME_AD_EMailConfig_ID, Integer.valueOf(AD_EMailConfig_ID));
	}

	/** Get EMail Configuration.
		@return EMail Configuration	  */
	public int getAD_EMailConfig_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_EMailConfig_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set EMail User Password.
		@param EMailUserPW 
		Password of your email user id
	  */
	public void setEMailUserPW (String EMailUserPW)
	{
		set_Value (COLUMNNAME_EMailUserPW, EMailUserPW);
	}

	/** Get EMail User Password.
		@return Password of your email user id
	  */
	public String getEMailUserPW () 
	{
		return (String)get_Value(COLUMNNAME_EMailUserPW);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Z_GPC_AttachConf ID.
		@param Z_GPC_AttachConf_ID Z_GPC_AttachConf ID	  */
	public void setZ_GPC_AttachConf_ID (int Z_GPC_AttachConf_ID)
	{
		if (Z_GPC_AttachConf_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Z_GPC_AttachConf_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Z_GPC_AttachConf_ID, Integer.valueOf(Z_GPC_AttachConf_ID));
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
}