# Extension Validation Report

- Extension: tachiyomi-es.nartag-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2973017642163731007
- Source name: Rncalation
- Source language: es
- Selected manga input: latest offset 0: Secuestré a la Hija Menor del Clan Tang de Sichuan (`.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 0 |  |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Secuestré a la Hija Menor del Clan Tang de Sichuan (`.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Secuestré a la Hija Menor del Clan Tang de Sichuan (`.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Secuestré a la Hija Menor del Clan Tang de Sichuan (`.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 22 | Capítulo 1 (`.../sGcxaEnUTmR5vud5tjPCO`) |  | <1s |
| pages | `getPageList(chapter)` | success | 23 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Secuestré a la Hija Menor del Clan Tang de Sichuan, URL=`.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan` |  |  |  |
| latest differs from popular | SKIP | Popular or latest has no manga to compare |  |  |  |
| popular pagination | SKIP | Page 1 has no manga to check |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rncalation.online/.../cover-1785167942756.webp` (image/webp (encoding: lossy), 64950 bytes, 300x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../secuestre-a-la-hija-menor-del-clan-tang-de-sichuan` |  |  |  |
| details thumbnail URL | PASS | `https://rncalation.online/.../cover-1785167942756.webp` |  |  |  |
| details author | PASS | Omniscient - Scan |  |  |  |
| details artist | PASS | Omniscient - Scan |  |  |  |
| details genres | PASS | En emisión, Shounen, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | LINT | Description is empty; use null when unknown |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 22 chapters |  |  |  |
| chapter dates | PASS | 22 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://rncalation.online/.../library <redacted query values: sort and page>` to `https://rncalation.online/.../library <redacted query values: sort>` (1 redirects); popular: `https://rncalation.online/.../library <redacted query values: page, q, and sort>` to `https://rncalation.online/.../library <redacted query values: q>` (1 redirects) |  |  |  |
| page load | PASS | `https://rncalation.online/.../1785460516343-44e44993-b1ed-43d9-9e76-6d7ac0c53955.jpg <redacted query values: t>` (image/jpeg, 3011359 bytes, 2496x1664) |  |  |  |
