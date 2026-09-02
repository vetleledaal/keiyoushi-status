# Extension Validation Report

- Extension: tachiyomi-en.gedecomix-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3956136651279281107
- Source name: GEDE Comix
- Source language: en
- Selected manga input: popular offset 0: AI Collab [Redoxa] (`.../22433`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | AI Collab [Redoxa] (`.../22433`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | The Masseur [Losekorntrol] (`.../17767`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | Summer Heat by [Cuncyun] (`.../35031`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | She-Hulk – Acts of Lust (`.../34979`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | AI Collab [Redoxa] (`.../22433`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | AI Collab [Redoxa] (`.../22433`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | AI Collab 1 (`.../ai-collab-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 13 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=AI Collab \[Redoxa\], URL=`22433` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gedecomix.com/.../AI-Collab-Redoxa-386x556.webp` (image/webp (encoding: lossy), 14016 bytes, 386x556) |  |  |  |
| details identity | PASS | Details preserved selected URL `22433` |  |  |  |
| details thumbnail URL | PASS | `https://gedecomix.com/.../AI-Collab-Redoxa-386x556.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Redoxa |  |  |  |
| details genres | PASS | 3D, Big Ass, Big Breasts, Incest, Milf, Mother |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Alternative Names: AI Collab 1-5 \[Redoxa\] |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 13 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gedecomix.com/.../1.jpg` (image/jpeg, 192996 bytes, 2048x2048) |  |  |  |
