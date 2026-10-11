# Extension Validation Report

- Extension: tachiyomi-id.crotpedia-v1.6.5
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 4023890583976163058
- Source name: CrotPedia
- Source language: id
- Selected manga input: popular offset 0: Ai wa Gouon de Sasayake (`.../ai-wa-gouon-de-sasayake`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Ai wa Gouon de Sasayake (`.../ai-wa-gouon-de-sasayake`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Ichika-chan wa Mechakucha ni Saretai (`.../ichika-chan-wa-mechakucha-ni-saretai`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Akuyuu to Kou Naru no wa Shouganai yo ne (`.../akuyuu-to-kou-naru-no-wa-shouganai-yo-ne`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Katekyo JD no Shuukatsu Love Jijou (`.../katekyo-jd-no-shuukatsu-love-jijou`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ai wa Gouon de Sasayake (`.../ai-wa-gouon-de-sasayake`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ai wa Gouon de Sasayake (`.../ai-wa-gouon-de-sasayake`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../ai-wa-gouon-de-sasayake-chapter-1-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ai wa Gouon de Sasayake, URL=`.../ai-wa-gouon-de-sasayake` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Ai-wa-Gouon-de-Sasayake.jpg <redacted query values: resize>` (image/jpeg, 23987 bytes, 225x310) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ai-wa-gouon-de-sasayake` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../Ai-wa-Gouon-de-Sasayake.jpg <redacted query values: resize>` |  |  |  |
| details author | PASS | Dorozumi |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Ahegao, Big Breast, Condom, Sole Female, Sole Male, Squirting, Uncensored, Vanilla, X-Ray, Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Rahasianya yang tak akan pernah bisa diucapkan.<br><br>Alternative Name: 愛は轟音で囁け |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://readerdua.eromanga.cfd/.../6d10ae36443ef5f51c3a2ce78947344a.jpg` (image/jpeg, 200322 bytes, 1440x2034) |  |  |  |
