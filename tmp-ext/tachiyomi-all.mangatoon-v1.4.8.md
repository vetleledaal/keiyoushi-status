# Extension Validation Report

- Extension: tachiyomi-all.mangatoon-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 2
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.b
- Source ID: 4795663388852759880
- Source name: MangaToon (Limited)
- Source language: en
- Selected manga input: latest offset 0: Rise of the Virus King (`.../rise-the-virus-king <redacted query values: content_id>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | Bossy President (`.../bossy-president <redacted query values: content_id>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | First Miss Reborn (`.../first-miss-reborn <redacted query values: content_id>`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 18 | Rise of the Virus King (`.../rise-the-virus-king <redacted query values: content_id>`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Rise of the Virus King (`.../rise-the-virus-king <redacted query values: content_id>`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Rise of the Virus King (`.../rise-the-virus-king <redacted query values: content_id>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 28 | Episode 1 (`.../196146`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 93 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Rise of the Virus King, URL=`.../rise-the-virus-king <redacted query values: content_id>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 55/55 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 55/55 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cn-e-pic-aliyun.mangatoon.mobi/.../6121144ce05.webp-posternew6` (image/webp (encoding: lossy), 29272 bytes, 450x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../rise-the-virus-king <redacted query values: content_id>` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cn-e-pic-aliyun.mangatoon.mobi/.../6121144ce05.jpg` (image/jpeg, 45476 bytes, 450x600) |  |  |  |
| details author | PASS | Kuaikan Comics |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The world is shrouded in apocalypse. The entire post-apocalyptic world has become a brutal game of evolution! This is humanity's greatest opportunity and trial ground, as well as a playground for gods and demons! Chen Bai is reborn ten days before the apocalypse began! He directly injects himself with the zombie virus, awakening his SSS talent: Virus King! He takes control of the virus and embarks on a unique path of evolution! MangaToon got authorization from Kuaikan Comics to publish this work, the content is the author's own point of view, and does not represent the stand of MangaToon. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 28 chapters |  |  |  |
| chapter dates | PASS | 28 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../196146` at offsets 0, 27, `.../196147` at offsets 1, 26, `.../196149` at offsets 2, 25, `.../196150` at offsets 3, 24, `.../196151` at offsets 4, 23, `.../196152` at offsets 5, 22, `.../196153` at offsets 6, 21, `.../196154` at offsets 7, 20, `.../196155` at offsets 8, 19, `.../196156` at offsets 9, 18, `.../196157` at offsets 10, 17, `.../196158` at offsets 11, 16, `.../196159` at offsets 12, 15, `.../196160` at offsets 13, 14 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 93 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://en-c-pic-aliyun.mangatoon.mobi/.../X.jpg` (image/jpeg, 82427 bytes, 1000x1800) |  |  |  |
