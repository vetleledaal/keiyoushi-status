# Extension Validation Report

- Extension: tachiyomi-en.hentaihere-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7266624490370375187
- Source name: HentaiHere
- Source language: en
- Selected manga input: popular offset 0: Sweet Guy (`.../14159-sweet-guy`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | Sweet Guy (`.../14159-sweet-guy`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 40 | My Story With My Harem In Another World (`.../38166-my-story-with-my-harem-in-another-world`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | Namaiki Na Meikko-Tachi Ga Asobi Ni Kita Node Mahou No Kagami De Juujun Ni Shite Kawaii Boku Senyou Dorei Ni Shita (`.../72440-namaiki-na-meikko-tachi-ga-asobi-ni-kita-node-mahou-no-kagami-de-juujun-ni-shite`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 40 | I'll Love You Again and Again (`.../72380-ill-love-you-again-and-again`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Crossdressing Guy and Sweetly Aggressive Woman (`.../66275-crossdressing-guy-and-sweetly-aggressive-woman`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sweet Guy (`.../14159-sweet-guy`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 38 | Chapter 1 - Sweet Guy 1 - 11 (`.../page-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 497 |  |  | <1s |

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
| popular listing | PASS | 40 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Sweet Guy, URL=`.../14159-sweet-guy` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 162/162 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 162/162 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hermes.hentai.direct/.../_S14159.jpg` (image/jpeg, 30630 bytes, 400x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../14159-sweet-guy` |  |  |  |
| details thumbnail URL | PASS | `https://hermes.hentai.direct/.../_S14159.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Big Breasts, Blow job, Censored, Full Color, Glasses, MILFs, Serialized |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 38 chapters |  |  |  |
| chapter dates | LINT | All 38 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=38 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 497 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://hentaihere.com/.../most-viewed` to `https://hentaihere.com/.../most-viewed` (1 redirects); popular: `https://hentaihere.com/.../page-1` to `https://hentaihere.com/.../newest` (1 redirects); popular: `https://hentaihere.com/.../page-2` to `https://hentaihere.com/.../page-2` (1 redirects) |  |  |  |
| page load | PASS | `https://hermes.hentai.direct/.../hcdn0001.jpg` (image/jpeg, 67150 bytes, 550x850) |  |  |  |
