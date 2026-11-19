# Extension Validation Report

- Extension: tachiyomi-pt.universohentai-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gattsu
- Source ID: 4207492914234184899
- Source name: Universo Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Ooyodo ni Semararete (`.../ooyodo-ni-semararete`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 17 | Ooyodo ni Semararete (`.../ooyodo-ni-semararete`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 17 | Juku no Ue no Massage-ya-san (`.../juku-no-ue-no-massage-ya-san`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ooyodo ni Semararete (`.../ooyodo-ni-semararete`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ooyodo ni Semararete (`.../ooyodo-ni-semararete`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capítulo único (`.../galeria <redacted query values: id>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 57 |  |  | 1-10s |

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
| popular listing | PASS | 17 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ooyodo ni Semararete, URL=`.../ooyodo-ni-semararete` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 35/35 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 35/35 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://universohentai.com/.../1-14-371x518.jpg` (image/jpeg, 188998 bytes, 371x518) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ooyodo-ni-semararete` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://universohentai.com/.../1-14.jpg` (image/jpeg, 385949 bytes, 1280x1807) |  |  |  |
| details author | PASS | Login |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Boquete, Creampie, Gravidez, Óculos, Pau Grande, Peitinhos, Pelos Pubianos, Raio-X |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 57 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://universohentai.com/.../2` to `https://universohentai.com/.../2` (1 redirects); popular: `https://universohentai.com/.../galeria <redacted query values: id>` to `https://universohentai.com/.../galeria <redacted query values: id>` (1 redirects) |  |  |  |
| page load | PASS | `https://universohentai.com/.../1-14.jpg` (image/jpeg, 385949 bytes, 1280x1807) |  |  |  |
