# Extension Validation Report

- Extension: tachiyomi-pt.bakai-v1.6.5
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 0
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1652448748031658277
- Source name: Bakai
- Source language: pt-BR
- Selected manga input: popular offset 0: Mukuchi na Anoko wa Aitsu no Mono (`.../mukuchi-na-anoko-wa-aitsu-no-mono`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 10 | Mukuchi na Anoko wa Aitsu no Mono (`.../mukuchi-na-anoko-wa-aitsu-no-mono`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Novo Hentai Exclusivo (`.../hentai-exclusivo-circle2`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | Socorro, Suave e Derretido! (`.../socorro-suave-e-derretido`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Mukuchi na Anoko wa Aitsu no Mono (`.../mukuchi-na-anoko-wa-aitsu-no-mono`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Mukuchi na Anoko wa Aitsu no Mono (`.../mukuchi-na-anoko-wa-aitsu-no-mono`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Mukuchi na Anoko wa Aitsu no Mono (`.../mukuchi-na-anoko-wa-aitsu-no-mono`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mukuchi na Anoko wa Aitsu no Mono, URL=`.../mukuchi-na-anoko-wa-aitsu-no-mono` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.bakai.org/.../01.thumb.webp.b8f759da802b3e5299279b5d08aae9b9.webp` (image/webp (encoding: lossy), 228232 bytes, 1416x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mukuchi-na-anoko-wa-aitsu-no-mono` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://img.bakai.org/.../01.webp.795419c9f9b9f3639b3d6769bdda94a2.webp` was not downloaded |  |  |  |
| details author | PASS | Capybara |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Doujin, Preto e Branco, Creampie, Netorare, Primeira Vez |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
