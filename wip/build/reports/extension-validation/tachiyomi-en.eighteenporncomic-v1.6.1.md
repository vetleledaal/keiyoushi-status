# Extension Validation Report

- Extension: tachiyomi-en.eighteenporncomic-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: manga18
- Source ID: 5133553291675008671
- Source name: 18 Porn Comic
- Source language: en
- Selected manga input: popular offset 0: Secret Class Uncensored (`.../secret-class-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Secret Class Uncensored (`.../secret-class-uncensored`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | XXX Apartments [Kirtu] (`.../xxx-apartments-kirtu`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Gonkei Exposure Girl (`.../gonkei-exposure-girl`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Seikaku Kitsume na Shigodeki Bakunyuu Onna Joushi no Amaama Akachan Play (`.../seikaku-kitsume-na-shigodeki-bakunyuu-onna-joushi-no-amaama-akachan-play`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secret Class Uncensored (`.../secret-class-uncensored`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secret Class Uncensored (`.../secret-class-uncensored`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 155 | # Chapter 1 (`.../1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 68 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secret Class Uncensored, URL=`.../secret-class-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `http://img.18porncomic.com/.../cover_thumb_2.webp` (image/jpeg, 6582 bytes, 150x200; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secret-class-uncensored` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://img.18porncomic.com/.../cover_250x350.jpg` (image/jpeg, 15341 bytes, 250x350) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | Wang Kang Cheol |  |  |  |
| details genres | PASS | MILF, Harem, Manhwa, Uncensored, Mature |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Secret Class Uncensored Manhwa also known as (AKA) Secret Class . This OnGoing 18PornComic was released on. Secret Class Uncensored is about MILF, Harem, Manhwa, Uncensored, Mature, , comic.<br><br>SECRET CLASS UNCENSORED<br><br>Alternative Names:<br>Secret Class |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 155 chapters |  |  |  |
| chapter dates | PASS | 155 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `http://img.18porncomic.com/.../cover_thumb_2.webp` to `https://img.18porncomic.com/.../cover_thumb_2.webp` (1 redirects) |  |  |  |
| page load | PASS | `https://img.18porncomic.com/.../01.jpg` (image/jpeg, 321306 bytes, 648x1229) |  |  |  |
