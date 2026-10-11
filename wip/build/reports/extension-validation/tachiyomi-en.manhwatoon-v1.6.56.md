# Extension Validation Report

- Extension: tachiyomi-en.manhwatoon-v1.6.56
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madara
- Source ID: 3590279382085161370
- Source name: Manhwa Toon
- Source language: en
- Selected manga input: popular offset 0: [ratatatat74] tomboy sister bully netorare [English] (`.../50650`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | [ratatatat74] tomboy sister bully netorare [English] (`.../50650`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 25 | [Sayryu] Tomboy with Big Tits Want to be Corrupted (COMIC Shingeki 2023-10) [English] [adamar] [Digital] (`.../50848`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 25 | God of Martial Arts (Original Translation) (`.../52346`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Awakening the Purple Thunder at the Beginning (`.../753`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [ratatatat74] tomboy sister bully netorare [English] (`.../50650`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [ratatatat74] tomboy sister bully netorare [English] (`.../50650`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[ratatatat74\] tomboy sister bully netorare \[English\], URL=`50650` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.manhwatoon.me/.../447120-50650-175x238.jpg` (image/jpeg, 13732 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `50650` |  |  |  |
| details thumbnail URL | FAIL | Differs from selected listing thumbnail; Thumbnail URL `https://cdn.manhwatoon.me/.../447120-50650-193x278.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 400 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details author | PASS | ratatatat74 \| mr.skull |  |  |  |
| details artist | PASS | ratatatat74 \| mr.skull |  |  |  |
| details genres | PASS | Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | tomboy sister bully netorare is a full color NTR nhentai comic by ratatatat74. An older sister gets mad that someone was bullying her younger brother so she goes to talk with him, but ends up having sex with the Bully! Discover and read your favorite doujinshi on ManhwaToon.me. Enjoy a smooth reading experience with a wide selection of titles, easy navigation, and a reader-friendly interface all in one place. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.manhwatoon.me/.../1.jpg` (image/jpeg, 304257 bytes, 1280x1969) |  |  |  |
