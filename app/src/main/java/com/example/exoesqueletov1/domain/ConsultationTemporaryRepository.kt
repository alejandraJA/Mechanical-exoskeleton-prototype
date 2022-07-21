package com.example.exoesqueletov1.domain

import android.content.SharedPreferences
import com.example.exoesqueletov1.data.local.sharedpreferences.ConsultationTemporary
import com.example.exoesqueletov1.data.local.sharedpreferences.GradosObservaciones
import javax.inject.Inject
import javax.inject.Named

class ConsultationTemporaryRepository @Inject constructor(@Named("consultationTemporary") private val sharedPreferences: SharedPreferences) {
    private val editor = sharedPreferences.edit()

    fun saveConsultation(consultationTemporary: ConsultationTemporary) {
        consultationTemporary.apply {
            for (i in listOfGrados.indices) {
                listOfGrados[i].observaciones.setString("observaciones${listOfGrados[i].position}")
                listOfGrados[i].grados.setString("grados${listOfGrados[i].position}")
            }
            id.setString("id")
            idPatient.setString("idPatient")
            motivo.setString("motivo")
            sintomatologia.setString("sintomatologia")
            pesoKg.setString("pesoKg")
            pesoG.setString("pesoG")
            talla.setString("talla")
            estaturaM.setString("estaturaM")
            estaturaCm.setString("estaturaCm")
            libre.setBoolean("libre")
            claudicante.setBoolean("claudicante")
            conAyuda.setBoolean("conAyuda")
            espasticas.setBoolean("espasticas")
            ataxica.setBoolean("ataxica")
            observaciones.setString("observaciones")
            reflejos.setString("reflejos")
            sensibilidad.setString("sensibilidad")
            lenguaje.setString("lenguaje")
            otros.setString("otros")
            dolor.setString("dolor")
            musculoSuperiorIzquierdo.setString("musculoSuperiorIzquierdo")
            musculoSuperiorDerecho.setString("musculoSuperiorDerecho")
            musculoInferiorIzquierdo.setString("musculoInferiorIzquierdo")
            musculoInferiorDerecho.setString("musculoInferiorDerecho")
            troncoIzquierdo.setString("troncoIzquierdo")
            troncoDerecho.setString("troncoDerecho")
            cuelloIzquierdo.setString("cuelloIzquierdo")
            cuelloDerecho.setString("cuelloDerecho")
            valoracionInicial.setString("valoracionInicial")
            subjetivo.setString("subjetivo")
            analisis.setString("analisis")
            planAccion.setString("planAccion")
            inicioMarcha.setBoolean("inicioMarcha")
            pieDerechoNoSobrepasa.setBoolean("pieDerechoNoSobrepasa")
            pieDerechoNoLevanta.setBoolean("pieDerechoNoLevanta")
            pieIzquierdoNoSobrepasa.setBoolean("pieIzquierdoNoSobrepasa")
            pieIzquierdoNoLevanta.setBoolean("pieIzquierdoNoLevanta")
            longitud.setBoolean("longitud")
            continuidad.setBoolean("continuidad")
            trayectoriaDesviacionAlta.setBoolean("trayectoriaDesviacionAlta")
            trayectoriaDesviacionMedia.setBoolean("trayectoriaDesviacionMedia")
            trayectoriaDesviacionNula.setBoolean("trayectoriaDesviacionNula")
            noBalanceoAlto.setBoolean("noBalanceoAlto")
            noBalanceoMedio.setBoolean("noBalanceoMedio")
            noBalanceoNulo.setBoolean("noBalanceoNulo")
            talones.setBoolean("talones")
            pruebasEquilibrioA.setInt("pruebasEquilibrioA")
            pruebasEquilibrioB.setInt("pruebasEquilibrioB")
            pruebasEquilibrioC.setInt("pruebasEquilibrioC")
            segundosMenor10.setBoolean("segundosMenor10")
            segundos.setString("segundos")
            objetivos.setString("objetivos")
            hipotesis.setString("hipotesis")
            estructuraCorporal.setString("estructuraCorporal")
            funcionCorporal.setString("funcionCorporal")
            actividad.setString("actividad")
            participacion.setString("participacion")
            diagnostico.setString("diagnostico")
            plan.setString("plan")
        }
    }

    fun getConsultation(): ConsultationTemporary {
        val listGrados = mutableListOf<GradosObservaciones>()
        for (i in 0..48) {
            val gradosObservaciones = GradosObservaciones()
            gradosObservaciones.observaciones = "observaciones$i".getString()
            gradosObservaciones.grados = "grados$i".getString()
            gradosObservaciones.position = i
            listGrados.add(gradosObservaciones)
        }
        val consultationTemporary = ConsultationTemporary()
        consultationTemporary.apply {
            listOfGrados.addAll(listGrados)
            id = "id".getString()
            idPatient = "idPatient".getString()
            motivo = "motivo".getString()
            sintomatologia = "sintomatologia".getString()
            pesoKg = "pesoKg".getString()
            pesoG = "pesoG".getString()
            talla = "talla".getString()
            estaturaM = "estaturaM".getString()
            estaturaCm = "estaturaCm".getString()
            libre = "libre".getBoolean()
            claudicante = "claudicante".getBoolean()
            conAyuda = "conAyuda".getBoolean()
            espasticas = "espasticas".getBoolean()
            ataxica = "ataxica".getBoolean()
            observaciones = "observaciones".getString()
            reflejos = "reflejos".getString()
            sensibilidad = "sensibilidad".getString()
            lenguaje = "lenguaje".getString()
            otros = "otros".getString()
            dolor = "dolor".getString()
            musculoSuperiorIzquierdo = "musculoSuperiorIzquierdo".getString()
            musculoSuperiorDerecho = "musculoSuperiorDerecho".getString()
            musculoInferiorIzquierdo = "musculoInferiorIzquierdo".getString()
            musculoInferiorDerecho = "musculoInferiorDerecho".getString()
            troncoIzquierdo = "troncoIzquierdo".getString()
            troncoDerecho = "troncoDerecho".getString()
            cuelloIzquierdo = "cuelloIzquierdo".getString()
            cuelloDerecho = "cuelloDerecho".getString()
            valoracionInicial = "valoracionInicial".getString()
            subjetivo = "subjetivo".getString()
            analisis = "analisis".getString()
            planAccion = "planAccion".getString()
            inicioMarcha = "inicioMarcha".getBoolean()
            pieDerechoNoSobrepasa = "pieDerechoNoSobrepasa".getBoolean()
            pieDerechoNoLevanta = "pieDerechoNoLevanta".getBoolean()
            pieIzquierdoNoSobrepasa = "pieIzquierdoNoSobrepasa".getBoolean()
            pieIzquierdoNoLevanta = "pieIzquierdoNoLevanta".getBoolean()
            longitud = "longitud".getBoolean()
            continuidad = "continuidad".getBoolean()
            trayectoriaDesviacionAlta = "trayectoriaDesviacionAlta".getBoolean()
            trayectoriaDesviacionMedia = "trayectoriaDesviacionMedia".getBoolean()
            trayectoriaDesviacionNula = "trayectoriaDesviacionNula".getBoolean()
            noBalanceoAlto = "noBalanceoAlto".getBoolean()
            noBalanceoMedio = "noBalanceoMedio".getBoolean()
            noBalanceoNulo = "noBalanceoNulo".getBoolean()
            talones = "talones".getBoolean()
            pruebasEquilibrioA = "pruebasEquilibrioA".getInt()
            pruebasEquilibrioB = "pruebasEquilibrioB".getInt()
            pruebasEquilibrioC = "pruebasEquilibrioC".getInt()
            segundosMenor10 = "segundosMenor10".getBoolean()
            segundos = "segundos".getString()
            objetivos = "objetivos".getString()
            hipotesis = "hipotesis".getString()
            estructuraCorporal = "estructuraCorporal".getString()
            funcionCorporal = "funcionCorporal".getString()
            actividad = "actividad".getString()
            participacion = "participacion".getString()
            diagnostico = "diagnostico".getString()
            plan = "plan".getString()
        }
        return consultationTemporary
    }

    private fun String.setString(key: String) = editor.putString(key, this).apply()
    private fun Boolean.setBoolean(key: String) = editor.putBoolean(key, this).apply()
    private fun Int.setInt(key: String) = editor.putInt(key, this).apply()

    private fun String.getString() = sharedPreferences.getString(this, "")!!
    private fun String.getBoolean() = sharedPreferences.getBoolean(this, false)
    private fun String.getInt() = sharedPreferences.getInt(this, 0)
}