# Extension Validation Report

- Extension: tachiyomi-es.ichijou-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 0
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 969093245723045798
- Source name: Ichijou Translations
- Source language: es
- Selected manga input: popular offset 0: La novia del ogro. (`.../229`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 29 | La novia del ogro. (`.../229`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 3 | ¡Cállate, dragón malvado! No quiero tener mas hijos contigo. (`.../156`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La novia del ogro. (`.../229`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La novia del ogro. (`.../229`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 51 | Vol. 1 - Cap. 1 - El encuentro del destino. (`.../1908`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 38 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 29 entries |  |  |  |
| latest listing | PASS | 3 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La novia del ogro., URL=`229` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 33/33 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 33/33 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ichijou.5e9b7ae62dde081ed360e85531f7d92e.r2.cloudflarestorage.com/.../card.2026-07-14T02_09_23.644Z.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (container: extended), 78076 bytes, 300x450; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `229` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://ichijou.5e9b7ae62dde081ed360e85531f7d92e.r2.cloudflarestorage.com/.../card.2026-07-14T02_09_23.644Z.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (container: extended), 78076 bytes, 300x450; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Destino, Drama, Fantasía, Recuentos de la vida (Slice of Life), Romance, Romance feminino, Sobrenatural, Vida escolar, Contenido general |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Manga<br><br>"He encontrado a mi novia".<br>Esto es Japón, donde youkai y humanos coexisten.<br>Oni, kitsune, nekomata... los youkai, con sus habilidades superiores y su belleza, juegan un papel central en Japón.<br>El único ser que trae prosperidad a los youkai, una chica humana encontrada como "novia" recibe la promesa de amor incondicional de los youkai.<br>Yuzu, una estudiante de secundaria, tiene una hermana menor que es la novia de un kitsune, y vive una vida de opresión y falta de amor.<br>El día en que su corazón finalmente se rompe, Yuzu conoce a un joven de belleza incomparable en la ciudad por la noche.<br>Con sus ojos rojos, él es Kiryuin Reiya, el próximo líder del clan Oni, el youkai más fuerte.<br><br>**Traducción:** Ichijou Translations, Underword Liella Novels<br><br>**Advertencias de contenido:**<br>- Contenido general (0+): Contenido apto para todo público<br><br>**Nombres alternativos:**<br>- 鬼の花嫁 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 51 chapters |  |  |  |
| chapter dates | PASS | 51 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 38 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://ichijou.5e9b7ae62dde081ed360e85531f7d92e.r2.cloudflarestorage.com/.../chapter-1908.2026-07-14T03_49_29.680Z.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (encoding: lossy), 125470 bytes, 800x1137; server Content-Type: application/octet-stream) |  |  |  |
