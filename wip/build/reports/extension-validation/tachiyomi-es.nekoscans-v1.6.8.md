# Extension Validation Report

- Extension: tachiyomi-es.nekoscans-v1.6.8
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 8396340084333456288
- Source name: NekoScans
- Source language: es
- Selected manga input: popular offset 0: Cruzando los muros del amor contigo (`.../kimi-to-koete-koi-ni-naru`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Cruzando los muros del amor contigo (`.../kimi-to-koete-koi-ni-naru`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 10 | Hana y el Hombre bestia color (`.../hana-y-el-hombre-bestia-color`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | La noble maldita y desterrada es seducida por el caballero bestia (`.../la-noble-maldita-y-desterrada-es-seducida-por-el-caballero-bestia`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 10 | El cariñoso dragón negro y su novia sacrificada (`.../abaki-nakase-sosogitai-dekiai-kokuryu-to-ikenie-hanayome`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Cruzando los muros del amor contigo (`.../kimi-to-koete-koi-ni-naru`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Cruzando los muros del amor contigo (`.../kimi-to-koete-koi-ni-naru`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 75 | Capítulo 1 (`.../kimi-to-koete-koi-ni-naru-capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Cruzando los muros del amor contigo, URL=`.../kimi-to-koete-koi-ni-naru` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../001.png <redacted query values: resize>` (image/png, 25428 bytes, 165x225) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kimi-to-koete-koi-ni-naru` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i0.wp.com/.../001.png` (image/png, 2257664 bytes, 1076x1690) |  |  |  |
| details author | PASS | YUZUKI Chihiro |  |  |  |
| details artist | PASS | YUZUKI Chihiro |  |  |  |
| details genres | PASS | Romance, Shoujo, Vida diaria, Vida escolar |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kimi to Koete Koi ni naru Mari es una estudiante de secundaria que vive en un pueblo donde coexisten hombres bestia y humanos. Cuando llega tarde a la escuela, se encuentra con Tsunagu, un hombre bestia que ha llegado a la escuela como un «estudiante especial» para el Programa de Educación de Hombres Bestia, en la puerta principal. Mari está desconcertada por su primer contacto con un hombre bestia, pero a medida que lo va conociendo, se siente atraída por su lado amable y puro. Sin embargo, algunos de sus compañeros de clase no parecen ser amables con los hombres bestia y ¡de repente, ambos quedan encerrados en un almacén y Tsunagu la abraza! y le dice: «Hueles dulce…» y su respiración se vuelve irregular. Una humana y un chico bestia. ¿Qué pasará con el amor entre dos personas que trasciende las razas? Puro y excitante amor juvenil entre especies. PRECUELA:<br><br>Nombres alternativos: <br>- Cross Race and Love You<br>- Crossing the Walls of Love with You<br>- Kimi to Koete Koi ni Naru<br>- キミと越えて恋になる<br>- 跨越种族与你相恋 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 75 chapters |  |  |  |
| chapter dates | PASS | 75 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://i2.wp.com/.../AVvXsEjodFi3LU9P6oYoUcweUM0y9oryFOVziGE-RH-8HjnCLS54iETQr4Cb4CgdFee_bTmJkJYeOgHldOzGq6ZWFPyFuFq8XFLLLNDjsOSdeT9iaULtxjS3T75jY0mBmS1DOKZJaeJFuB1462Ura7YpWFhOm04dDQ882ivL06jdDoaFzfAfKNeeeUXKwup6tA` to `https://blogger.googleusercontent.com/.../AVvXsEjodFi3LU9P6oYoUcweUM0y9oryFOVziGE-RH-8HjnCLS54iETQr4Cb4CgdFee_bTmJkJYeOgHldOzGq6ZWFPyFuFq8XFLLLNDjsOSdeT9iaULtxjS3T75jY0mBmS1DOKZJaeJFuB1462Ura7YpWFhOm04dDQ882ivL06jdDoaFzfAfKNeeeUXKwup6tA` (1 redirects) |  |  |  |
| page load | PASS | `https://i2.wp.com/.../AVvXsEjodFi3LU9P6oYoUcweUM0y9oryFOVziGE-RH-8HjnCLS54iETQr4Cb4CgdFee_bTmJkJYeOgHldOzGq6ZWFPyFuFq8XFLLLNDjsOSdeT9iaULtxjS3T75jY0mBmS1DOKZJaeJFuB1462Ura7YpWFhOm04dDQ882ivL06jdDoaFzfAfKNeeeUXKwup6tA` (image/jpeg, 707043 bytes, 764x1200) |  |  |  |
