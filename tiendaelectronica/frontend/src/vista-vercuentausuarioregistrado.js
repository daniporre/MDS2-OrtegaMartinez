import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaVercuentausuarioregistrado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
 <vaadin-horizontal-layout style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-self: stretch; justify-content: center;" theme="spacing">
  <vaadin-button id="inicio-button">
    Inicio 
  </vaadin-button>
  <vaadin-text-field placeholder="Search" style="width: 40%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-button theme="icon" aria-label="Add new">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="correoButton">
    Correo 
  </vaadin-button>
  <vaadin-button id="carrito-button">
    Carrito 
  </vaadin-button>
  <vaadin-button id="logout-button">
    Cerrar sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: stretch; margin: var(--lumo-space-l);">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 33%;">
    <h3>Dirección de entrega</h3>
    <vaadin-text-field label="Calle" style="align-self: stretch;" id="calleTF"></vaadin-text-field>
    <vaadin-text-field label="Código postal" style="align-self: stretch;" id="codigoPostalTF"></vaadin-text-field>
    <vaadin-text-field label="Ciudad" style="align-self: stretch;" id="ciudadTF"></vaadin-text-field>
    <vaadin-text-field label="Provincia" style="align-self: stretch;" id="provinciaTF"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
     <vaadin-button id="editarDireccionButton">
       Editar 
     </vaadin-button>
     <vaadin-button id="guardarDireccionButton" style="flex-grow: 0; flex-shrink: 1;">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="flex-grow: 1; width: 33%;">
    <h3>Tarjeta bancaria</h3>
    <vaadin-text-field label="Titular tarjeta" id="titularTarjeta" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Numero tarjeta" id="numeroTarjetaTF" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Fecha de vencimiento" style="align-self: stretch;" id="fechaVencimientoTTF"></vaadin-text-field>
    <vaadin-text-field label="CVS" style="align-self: stretch;" id="cvsTF"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
     <vaadin-button id="editarTarjetaButton">
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;" id="guardarNuevaTarjetaButton">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; width: 33%;">
    <h3>Datos personales </h3>
    <vaadin-text-field label="Nombre" style="align-self: stretch;" id="nombreTF"></vaadin-text-field>
    <vaadin-text-field label="Apellidos" id="apellidosTF" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Nombre de usuario" id="nombreDeUsuario" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="Email" style="align-self: stretch;" id="emailTF"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
     <vaadin-button id="editarDatosPersonalesButton">
       Editar 
     </vaadin-button>
     <vaadin-button style="flex-grow: 0; flex-shrink: 1;" id="guardarDatosPersonalesButton">
       Guardar 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <vaadin-text-field id="nuevaContraseñaTF" style="align-self: stretch;" placeholder="Introduce tu nueva contraseña"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <vaadin-button theme="primary" id="cambiarContraseñaButton">
       Cambiar contraseña 
     </vaadin-button>
     <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
     <vaadin-button theme="primary error" id="darmeDeBajaButton">
       Darme de baja 
     </vaadin-button>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
    <h3 style="width: 15%;">Fecha</h3>
    <h3 style="width: 15%;">Referencia</h3>
    <h3 style="width: 15%;">Total</h3>
    <h3 style="width: 15%;">Estado</h3>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="listaPedidosLayout" style="align-self: stretch;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercuentausuarioregistrado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercuentausuarioregistrado.is, VistaVercuentausuarioregistrado);
