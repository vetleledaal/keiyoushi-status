# Extension Validation Report

- Extension: tachiyomi-en.kingcomix-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source ID: 8953466777316975228
- Source name: KingComiX
- Source language: en
- Selected manga input: popular offset 0: Undercover Fun – Acupa (`.../undercover-fun-acupa`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Undercover Fun – Acupa (`.../undercover-fun-acupa`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Love for Amalthea 4 – Kinkymation (`.../love-for-amalthea-4-kinkymation`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 24 | Undercover Fun – Acupa (`.../undercover-fun-acupa`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Undercover Fun – Acupa (`.../undercover-fun-acupa`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../undercover-fun-acupa`) |  | <1s |
| pages | `getPageList(chapter)` | success | 64 |  |  | <1s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Undercover Fun – Acupa, URL=`.../undercover-fun-acupa` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kingcomix.com/.../Undercover-Fun-%E2%80%93-Acupa-cover-263x365.webp` (image/webp (encoding: lossy), 27560 bytes, 263x365) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../undercover-fun-acupa` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://kingcomix.com/.../Undercover-Fun-%E2%80%93-Acupa-cover.webp` (image/webp (encoding: lossy), 232344 bytes, 1280x1925) |  |  |  |
| details author | PASS | EDDY |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Furry Porn Comics, Big Ass, Full Color, Porn Parody, Small Tits, Teen, Zootopia |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 64 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://kingcomix.com <redacted query values: s>` to `https://kingcomix.com` (1 redirects) |  |  |  |
| page load | PASS | `https://kingcomix.com/.../Undercover-Fun-%E2%80%93-Acupa-cover.webp` (image/webp (encoding: lossy), 232344 bytes, 1280x1925) |  |  |  |
