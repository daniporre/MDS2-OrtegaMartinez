import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-tabs/src/vaadin-tab.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaVercarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="primerVlayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
  <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
  <vaadin-button id="carritoButton">
    Carrito 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button id="miCuentaButton">
    Mi cuenta 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
  <vaadin-button id="iniciarSesionButton">
    Iniciar sesión 
  </vaadin-button>
  <vaadin-tab></vaadin-tab>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="flex-grow: 1; flex-shrink: 0; flex-basis: auto; align-self: stretch; margin: var(--lumo-space-xl); margin-top: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-start;">
   <h2>Cesta de la compra</h2>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-button id="continuarComprandoButton" style="align-self: center;">
     Continuar comprando 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <h3>Descripción</h3>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <vaadin-tab></vaadin-tab>
   <vaadin-tab></vaadin-tab>
   <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
   <h3>Precio</h3>
   <vaadin-tab></vaadin-tab>
   <vaadin-button theme="primary" id="actualizarButton" style="align-self: center;">
     Actualizar carrito 
   </vaadin-button>
   <vaadin-tab style="flex-grow: 0;"></vaadin-tab>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="productosEnCarritoVLayout" style="align-self: stretch;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
   <vaadin-vertical-layout style="flex-grow: 1; flex-shrink: 1;" id="metodoYdireccionVLayout">
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <h4>Método de pago</h4>
     <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
     <vaadin-button id="editarPagoDireccionButton" style="align-self: center;">
       Editar metodo de pago y dirección 
     </vaadin-button>
    </vaadin-horizontal-layout>
    <label id="metodoDePagoButton">metodoDePago</label>
    <h4>Dirección</h4>
    <label id="direccionUsuarioButton">direccionUsuario</label>
    <label id="ciudadLabel">ciudad</label>
    <label id="cpLabel">Label</label>
    <label id="provinciaLabel">Label</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; flex-shrink: 0;">
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <h3>Gastos de envío</h3>
     <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
     <label id="gastosEnvioLabel" style="align-self: center;">gastosEnvio</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;">
     <h3>Total</h3>
     <vaadin-tab style="flex-grow: 1;"></vaadin-tab>
     <h3 id="precioTotalLabel">precioTotal</h3>
    </vaadin-horizontal-layout>
    <vaadin-button theme="primary" id="tramitarPedidoButton" style="align-self: stretch;">
      Tramitar pedido 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-vercarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVercarrito.is, VistaVercarrito);
