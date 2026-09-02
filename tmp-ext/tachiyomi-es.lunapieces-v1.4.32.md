# Extension Validation Report

- Extension: tachiyomi-es.lunapieces-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 688847276247637882
- Source name: Luna Pieces
- Source language: es
- Selected manga input: popular offset 0: La bella y la bestia – Zoro x Sanji DJ ESP (`.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | La bella y la bestia – Zoro x Sanji DJ ESP (`.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Nunca te voy a olvidar – Law x Luffy DJ ESP (`.../nunca-te-voy-a-olvidar-law-x-luffy-dj-esp`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | La bella y la bestia – Zoro x Sanji DJ ESP (`.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Cómo disfrutar de la leche de tu amante – Marco x Ace DJ ESP (`.../como-disfrutar-de-la-leche-de-tu-amante-marco-x-ace-dj-esp`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | La bella y la bestia – Zoro x Sanji DJ ESP (`.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Capítulo 1 - Leer La bella y la bestia Volumen 1 (`.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp-volumen-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.wp.com/.../LPF-The-Beauty-and-the-Beast-Vol.-1-Espanol-Page-1.png <redacted query values: resize>` (image/jpeg, 47026 bytes, 285x425) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-bella-y-la-bestia-zoro-x-sanji-dj-esp` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i2.wp.com/.../LPF-The-Beauty-and-the-Beast-Vol.-1-Espanol-Page-1.png` (image/jpeg, 1189814 bytes, 1600x2500) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Caacatte Pixiv |  |  |  |
| details genres | PASS | Zoro x sanji |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Basado en el clásico cuento de “La Bella y la Bestia”, este DJ se adentra en el mundo mágico de un joven guapo amante de la lectura que se enfrasca en la aventura de su vida al conocer a una criatura verde y grande. Notas : Nuevamente nosotras con un nuevo proyecto de Caacatte Pixiv que les va a encantar, gracias infinitas a la autora que nos permitió traducir esto al español. Link a su perfil de Pixiv: Cacaate Pixiv<br><br>Nombres alternativos: R-15 \| By Caacatte Pixiv |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i0.wp.com/.../LPF-The-Beauty-and-the-Beast-Vol.-1-Espanol-Page-1-1.png` (image/webp (container: extended), 1015510 bytes, 1600x2500) |  |  |  |
