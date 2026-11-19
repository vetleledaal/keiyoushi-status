# Extension Validation Report

- Extension: tachiyomi-vi.suicaodex-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7951014720451165454
- Source name: SuicaoDex
- Source language: vi
- Selected manga input: popular offset 0: Bạn Của Bạn Gái Tôi (`.../01a0de90-39fe-7fc8-b9f5-2ee382d65691`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Bạn Của Bạn Gái Tôi (`.../01a0de90-39fe-7fc8-b9f5-2ee382d65691`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 36 | Nàng  Elf Chubby (`.../01a12efd-abfe-73d5-b5d6-a3e08b3831b7`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Shukuteki no Ie no Toushu o Tsuma ni Moraimashita: Tsuma wa Karen de Hakanakute Yasashikute Kashikokute Kawaikute Saikou desu (`.../01a12c1a-3486-7735-974c-f18487c5532d`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Bạn Của Bạn Gái Tôi (`.../01a0de90-39fe-7fc8-b9f5-2ee382d65691`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Bạn Của Bạn Gái Tôi (`.../01a0de90-39fe-7fc8-b9f5-2ee382d65691`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 153 | Vol. 1 Ch. 0 (`.../01a121ee-a723-772a-8047-06ab0379504e`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 13 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Bạn Của Bạn Gái Tôi, URL=`01a0de90-39fe-7fc8-b9f5-2ee382d65691` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 83/83 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 83/83 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.suicaodex.com/.../t9efoha8n9.256.webp` (image/webp (encoding: lossy), 25146 bytes, 256x365) |  |  |  |
| details identity | PASS | Details preserved selected URL `01a0de90-39fe-7fc8-b9f5-2ee382d65691` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://i.suicaodex.com/.../t9efoha8n9.512.webp` (image/webp (encoding: lossy), 68618 bytes, 512x728) |  |  |  |
| details author | PASS | Jyura |  |  |  |
| details artist | PASS | Jyura |  |  |  |
| details genres | PASS | Adult, Drama, Ecchi, Mature, Romance, School Life, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | He got a cute girlfriend who was the first in his life, but her friend tempted him with a body that was lewder than her... What would you do if your girlfriend's friend pressed you like this? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 153 chapters |  |  |  |
| chapter dates | PASS | 153 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.suicaodex.com/.../001-d9297997-4ed5-4a03-9766-45c42e9c276e.webp` (image/webp (encoding: lossy), 96644 bytes, 1126x1600) |  |  |  |
