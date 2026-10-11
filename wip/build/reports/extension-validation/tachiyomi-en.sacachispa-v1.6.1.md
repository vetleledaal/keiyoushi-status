# Extension Validation Report

- Extension: tachiyomi-en.sacachispa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 388932303664463452
- Source name: SACACHISPA
- Source language: en
- Selected manga input: popular offset 0: Osananajimi wa Itsumo Sakibashiru (`.../1134ae2f-1c66-4f95-bf83-25c65d9d7147`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Osananajimi wa Itsumo Sakibashiru (`.../1134ae2f-1c66-4f95-bf83-25c65d9d7147`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Osananajimi wa Itsumo Sakibashiru (`.../1134ae2f-1c66-4f95-bf83-25c65d9d7147`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Osananajimi wa Itsumo Sakibashiru (`.../1134ae2f-1c66-4f95-bf83-25c65d9d7147`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Chapter 1 (`.../9f9aaa0e-700d-458e-bd1d-39f16f0e1435`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Osananajimi wa Itsumo Sakibashiru, URL=`1134ae2f-1c66-4f95-bf83-25c65d9d7147` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 19/19 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 19/19 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.sacachispa.site/.../1ceea4a2-09f2-48e3-81b5-93eb297a2f84.webp` (image/webp (encoding: lossy), 87464 bytes, 512x719) |  |  |  |
| details identity | PASS | Details preserved selected URL `1134ae2f-1c66-4f95-bf83-25c65d9d7147` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.sacachispa.site/.../1ceea4a2-09f2-48e3-81b5-93eb297a2f84.webp` |  |  |  |
| details author | PASS | Ushi Hashiru |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | COMEDY, ROMANCE |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Leaving Haruta and his dead-end life behind, his childhood friend Yui Sakuraba raced off down a path of glamour—only to return home a few years later, newly divorced!? Gazing down at Haruta through the window, Yui's eyes now radiate a captivating, mature allure. And Haruta, who has always been drawn to her...!? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.sacachispa.site/.../9503a5d3-00d5-425a-9aa9-532c14ababe3.webp` (image/webp (encoding: lossy), 809726 bytes, 1365x1920) |  |  |  |
