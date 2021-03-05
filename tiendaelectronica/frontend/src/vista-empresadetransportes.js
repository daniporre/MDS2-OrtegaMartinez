import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-empresadetransportes`
 *
 * VistaEmpresadetransportes element.
 *
 * @customElement
 * @polymer
 */
class VistaEmpresadetransportes extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-empresadetransportes';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEmpresadetransportes.is, VistaEmpresadetransportes);
