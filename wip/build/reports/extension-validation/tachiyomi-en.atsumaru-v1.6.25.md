# Extension Validation Report

- Extension: tachiyomi-en.atsumaru-v1.6.25
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2327480808438768017
- Source name: Atsumaru
- Source language: en
- Selected manga input: popular offset 0: The Crazy Villain Regains His Sanity (`.../U8Sm`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 40 | The Crazy Villain Regains His Sanity (`.../U8Sm`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 40 | Surviving the Game as a Barbarian (`.../9x1wi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 40 | The Legendary Spearman Returns (`.../TtkLv`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 40 | Uncle from Another World (`.../4a7Lf`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | The Crazy Villain Regains His Sanity (`.../U8Sm`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | The Crazy Villain Regains His Sanity (`.../U8Sm`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 88 | Chapter 0 (`.../JE8FH2`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 14 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Crazy Villain Regains His Sanity, URL=`U8Sm` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 161/161 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 161/161 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://atsu.moe/.../PsaTx838BwOcMlpV-large.avif` (image/avif (format: avif), 71904 bytes, 400x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `U8Sm` |  |  |  |
| details thumbnail URL | PASS | `https://atsu.moe/.../PsaTx838BwOcMlpV-large.avif` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Manwha |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | **Views**: 209.7K<br><br><br>**Synopsis**: No synopsis available |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 88 chapters |  |  |  |
| chapter dates | PASS | 88 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://atsu.moe/.../PsaTx838BwOcMlpV-large.avif` to `https://cdn.atsu.moe/.../PsaTx838BwOcMlpV-large.avif` (1 redirects) |  |  |  |
| page load | PASS | `https://cdn.atsu.moe/.../975f6386b92fc7af.webp` (image/webp (encoding: lossy), 524670 bytes, 800x13735) |  |  |  |
