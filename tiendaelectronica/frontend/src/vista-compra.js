import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compra`
 *
 * VistaCompra element.
 *
 * @customElement
 * @polymer
 */
class VistaCompra extends PolymerElement {

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
        return 'vista-compra';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompra.is, VistaCompra);
