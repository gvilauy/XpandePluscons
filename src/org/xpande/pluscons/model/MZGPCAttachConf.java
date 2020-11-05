package org.xpande.pluscons.model;

import org.compiere.model.Query;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Modelo para configuración del proceso de copia de adjuntos.
 * Product: Adempiere ERP & CRM Smart Business Solution. Localization : Uruguay - Xpande
 * Xpande. Created by Gabriel Vila on 11/2/20.
 */
public class MZGPCAttachConf extends X_Z_GPC_AttachConf{

    public MZGPCAttachConf(Properties ctx, int Z_GPC_AttachConf_ID, String trxName) {
        super(ctx, Z_GPC_AttachConf_ID, trxName);
    }

    public MZGPCAttachConf(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }


    /***
     * Obtiene y retorna modelo por defecto.
     * Xpande. Created by Gabriel Vila on 11/2/20.
     * @param ctx
     * @param trxName
     * @return
     */
    public static MZGPCAttachConf getDefault(Properties ctx, String trxName){

        MZGPCAttachConf model = new Query(ctx, I_Z_GPC_AttachConf.Table_Name, "", trxName).first();

        return model;
    }

    /***
     * Obtiene y retorna modelo de remitente segun email recibido.
     * Xpande. Created by Gabriel Vila on 11/2/20.
     * @param remitente
     * @return
     */
    public MZGPCAttachConfRem getRemitente(String remitente) {

        String whereClause = X_Z_GPC_AttachConfRem.COLUMNNAME_Z_GPC_AttachConf_ID + " =" + this.get_ID() +
                " AND lower(" + X_Z_GPC_AttachConfRem.COLUMNNAME_EMail + ") ='" + remitente.toLowerCase().trim() + "'";

        MZGPCAttachConfRem model = new Query(getCtx(), I_Z_GPC_AttachConfRem.Table_Name, whereClause, get_TrxName()).first();

        return model;
    }
}
