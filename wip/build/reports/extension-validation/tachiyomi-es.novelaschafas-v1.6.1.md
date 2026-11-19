# Extension Validation Report

- Extension: tachiyomi-es.novelaschafas-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 0
- Warnings: 1
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2856728344376003939
- Source name: Novelas Chafas
- Source language: es
- Selected manga input: popular offset 0: La novia enjaulada se ahoga en el destino (`.../la-novia-enjaulada-se-ahoga-en-el.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | La novia enjaulada se ahoga en el destino (`.../la-novia-enjaulada-se-ahoga-en-el.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | La novia enjaulada se ahoga en el destino (`.../la-novia-enjaulada-se-ahoga-en-el.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | La novia enjaulada se ahoga en el destino (`.../la-novia-enjaulada-se-ahoga-en-el.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | Capítulo 1 (`.../1_5.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 45 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=La novia enjaulada se ahoga en el destino, URL=`.../la-novia-enjaulada-se-ahoga-en-el.html` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 13/13 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 13/13 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://blogger.googleusercontent.com/.../4321%20sin%20t%C3%ADtulo.jpg` (image/jpeg, 2382623 bytes, 1898x2628) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../la-novia-enjaulada-se-ahoga-en-el.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://blogger.googleusercontent.com/.../4321%20sin%20t%C3%ADtulo.jpg` (image/jpeg, 2382623 bytes, 1898x2628) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **#FINALIZADO**<br><br>**¿¡Soy un beta y estoy en celo...!? Pero... ¡¡No puedo resistir la sensación...!!**<br><br>Lazar, un beta, vive en el pueblo desértico de Teshud, esperando un poco de felicidad, con su hermana menor que se casará el próximo mes.<br><br>Pero un día, por casualidad, conoce a Eijas, el príncipe alfa que gobierna este país...!?<br><br>*"Si dices que eres un beta, ¿quieres probarlo en tu cuerpo? Si no reaccionas, Te enviaré a casa"*, dijo el alfa que gobierna el harén.<br><br>**¡El nacimiento de una nueva y dramática diferencia de clases omegaverse!** |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 45 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../4321%20sin%20t%C3%ADtulo.jpg` (image/jpeg, 2382623 bytes, 1898x2628) |  |  |  |
