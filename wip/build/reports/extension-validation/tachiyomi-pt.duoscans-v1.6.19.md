# Extension Validation Report

- Extension: tachiyomi-pt.duoscans-v1.6.19
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
- Source theme: zeistmanga
- Source ID: 5738568067614123099
- Source name: Duo Scans
- Source language: pt-BR
- Selected manga input: popular offset 0: Wail of a Dragon's Rage (`.../wail-of-dragons-rage.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 2 | Wail of a Dragon's Rage (`.../wail-of-dragons-rage.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 2 | The House Without Time (`.../the-house-without-time.html`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Wail of a Dragon's Rage (`.../wail-of-dragons-rage.html`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Wail of a Dragon's Rage (`.../wail-of-dragons-rage.html`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Ch 1 (`.../ch-1_31.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 200 |  |  | 1-10s |

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
| popular listing | PASS | 2 entries |  |  |  |
| latest listing | PASS | 2 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Wail of a Dragon's Rage, URL=`.../wail-of-dragons-rage.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 5/5 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 5/5 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lh3.googleusercontent.com/.../AEn0k_v8dH9zm8i7L5O13A1iriLgn9wx1r6rJUjy_MrtgUKm2aBMtzKiioODZW78l_KN2PIlLXpz3Hc5scBnuJxbCmm3uvY` (image/png, 220102 bytes, 394x512) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../wail-of-dragons-rage.html` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://lh3.googleusercontent.com/.../AEn0k_v8dH9zm8i7L5O13A1iriLgn9wx1r6rJUjy_MrtgUKm2aBMtzKiioODZW78l_KN2PIlLXpz3Hc5scBnuJxbCmm3uvY=w600` (image/png, 421837 bytes, 600x779) |  |  |  |
| details author | PASS | Jodeon |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy, Martial Arts, Seinen, Supernatural |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | " Ananta, um descendente de um dos Seis Primeiros Encarnados, pode se transformar em um dragão lutador imparável sempre que algo se meter em seu caminho. É um poder de que ele precisará em sua busca por vingança contra o Encarnação das Asas, um enganador sedento de poder que se assemelha a um anjo celestial apenas na aparência." |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 200 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://blogger.googleusercontent.com/.../01.png` (image/png, 808753 bytes, 1274x1046) |  |  |  |
