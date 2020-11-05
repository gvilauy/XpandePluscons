package org.xpande.pluscons.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuración de remitentes en proceso de copia de adjuntos.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/2/20.
 */
public class MZGPCAttachConfRem extends X_Z_GPC_AttachConfRem{

    public MZGPCAttachConfRem(Properties ctx, int Z_GPC_AttachConfRem_ID, String trxName) {
        super(ctx, Z_GPC_AttachConfRem_ID, trxName);
    }

    public MZGPCAttachConfRem(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
}
