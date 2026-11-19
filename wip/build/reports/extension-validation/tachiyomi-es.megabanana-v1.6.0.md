# Extension Validation Report

- Extension: tachiyomi-es.megabanana-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8432185452115232481
- Source name: MegaBanana
- Source language: es
- Selected manga input: popular offset 0: Leer The Courtyard de Alan Moore Comic Online en Español (`.../6893`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 48 | Leer The Courtyard de Alan Moore Comic Online en Español (`.../6893`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 48 | Leer Street Fighter Masters – Blanka Comic Online en Español (`.../6747`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Leer The Courtyard de Alan Moore Comic Online en Español (`.../6893`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Leer The Courtyard de Alan Moore Comic Online en Español (`.../6893`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo 1 (Fin) (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Leer The Courtyard de Alan Moore Comic Online en Español, URL=`6893` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://megabanana.mx/.../d4445766aceba38c87f71416f4eb15cd.webp` (image/webp (encoding: lossy), 65342 bytes, 417x640) |  |  |  |
| details identity | PASS | Details preserved selected URL `6893` |  |  |  |
| details thumbnail URL | PASS | `https://megabanana.mx/.../d4445766aceba38c87f71416f4eb15cd.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Comics, Independientes |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | The Courtyard, de Alan Moore, es un cómic de terror cósmico que combina investigación criminal, atmósfera urbana y la influencia de H. P. Lovecraft. Adaptado por Antony Johnston a partir de un relato de Moore e ilustrado por Jacen Burrows, propone una lectura breve e inquietante en la que cada detalle puede alterar la interpretación del conjunto.<br><br>La historia sigue a Aldo Sax, un agente del FBI que aplica métodos poco convencionales para encontrar conexiones entre varios asesinatos atroces. Su investigación lo conduce a un entorno de música underground, drogas y personajes esquivos, donde las explicaciones habituales comienzan a resultar insuficientes. Lo que parece un caso policial se transforma gradualmente en una aproximación a algo que desborda las herramientas del investigador.<br><br>El dibujo preciso de Burrows refuerza esa transición mediante escenarios opresivos y una narración visual que permite que la extrañeza se instale antes de hacerse evidente. El lenguaje, la percepción y los límites del razonamiento ocupan un lugar central, mientras la perspectiva de su protagonista añade una incomodidad que va más allá de lo sobrenatural.<br><br>Publicado por Avatar Press, The Courtyard destaca por su concentración narrativa y por integrar el imaginario lovecraftiano en un contexto contemporáneo. Es una propuesta especialmente atractiva para lectores interesados en el horror adulto, los relatos detectivescos perturbadores y las historias que dejan preguntas abiertas después de la última página. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://megabanana.mx/.../d4e66cabd32440d38145cb80df2e8e0d.webp` (image/webp (encoding: lossy), 199858 bytes, 998x1424) |  |  |  |
