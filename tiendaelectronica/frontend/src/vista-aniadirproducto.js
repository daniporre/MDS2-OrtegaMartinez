import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaAniadirproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;

                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="inicioButton">
    Inicio 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; flex-direction: column;">
  <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-direction: row; margin: var(--lumo-space-l); flex-shrink: 1;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-self: stretch; margin: var(--lumo-space-m);">
    <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0;">
     <img id="foto1Image" style="width: 10%; height: 10%;">
     <img id="foto2Image" style="width: 10%; height: 10%;">
     <img style="width: 10%; height: 10%;" id="foto3Image">
     <img style="width: 10%; height: 10%;" id="foto4Image">
    </vaadin-horizontal-layout>
    <vaadin-text-field label="src: imagen 1" id="imagen1TFsrc" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="src: imagen 2" id="imagen2TFsrc" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="src: imagen 3" id="imagen3TFsrc" style="align-self: stretch;"></vaadin-text-field>
    <vaadin-text-field label="src: imagen 4" id="imagen4TFsrc" style="align-self: stretch;"></vaadin-text-field>
   </vaadin-vertical-layout>
   <vaadin-tab></vaadin-tab>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 1; align-items: stretch;">
    <vaadin-text-field label="Nombre del producto" id="nombreProductoTF"></vaadin-text-field>
    <vaadin-text-field label="Precio del producto" id="precioProductoTF"></vaadin-text-field>
    <vaadin-text-field label="Marca del producto" id="marcaProductoTF"></vaadin-text-field>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: space-between;">
     <h2 style="flex-shrink: 0; flex-grow: 1;">Oferta</h2>
     <vaadin-combo-box id="ofertasProductoTF" style="flex-grow: 1; align-self: center;"></vaadin-combo-box>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-l);">
   <vaadin-text-area label="Descripcion del producto" placeholder="Añade una descripción detallada del producto." id="descripcionProductoTF" style="align-self: stretch;"></vaadin-text-area>
   <vaadin-button theme="primary" style="align-self: flex-end;" id="guardarCambiosButton">
     Guardar cambios 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-aniadirproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAniadirproducto.is, VistaAniadirproducto);
