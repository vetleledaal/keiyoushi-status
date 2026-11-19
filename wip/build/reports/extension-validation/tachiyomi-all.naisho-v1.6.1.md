# Extension Validation Report

- Extension: tachiyomi-all.naisho-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 246007156644245992
- Source name: Naisho
- Source language: all
- Selected manga input: popular offset 0: [pepper0] Family (59.5) (`.../rm49s1vg`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | [pepper0] Family (59.5) (`.../rm49s1vg`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [Calin] グイグイ迫る時雨さん(成人向) (`.../uebswfis`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [Calin] 時雨の新水着えっちすぎな委員会 (`.../wzaamwnb`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [pepper0] Family (59.5) (`.../rm49s1vg`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [pepper0] Family (59.5) (`.../rm49s1vg`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 6 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[pepper0\] Family (59.5), URL=`.../rm49s1vg` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s2.naisho.moe/.../0000-fd6f2bdf-pzmkfefi.png` (image/jpeg, 10074 bytes, 247x350; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rm49s1vg` |  |  |  |
| details thumbnail URL | PASS | `https://s2.naisho.moe/.../0000-fd6f2bdf-pzmkfefi.png` |  |  |  |
| details author | PASS | pepper0 |  |  |  |
| details artist | PASS | pepper0 |  |  |  |
| details genres | PASS | parody:original, artist:pepper0, male:sole male, male:first person perspective, female:sole female, female:blowjob, female:ponytail, female:big breasts, mixed:incest |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Category:** Artist CG · **Language:** japanese · **Pages:** 6 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 6 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://s2.naisho.moe/.../0001-fd6f2bdf-xiwohfi7.png` (image/jpeg, 76715 bytes, 980x1386; server Content-Type: image/png) |  |  |  |
