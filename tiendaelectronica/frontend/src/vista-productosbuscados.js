import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productosbuscados`
 *
 * VistaProductosbuscados element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosbuscados extends PolymerElement {

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
        return 'vista-productosbuscados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosbuscados.is, VistaProductosbuscados);
