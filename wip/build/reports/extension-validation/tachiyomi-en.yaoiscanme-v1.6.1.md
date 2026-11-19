# Extension Validation Report

- Extension: tachiyomi-en.yaoiscanme-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: yiimanga
- Source ID: 2975409305226490397
- Source name: YaoiScan (Unoriginal)
- Source language: en
- Selected manga input: popular offset 0: Kimi ha Harumade Boku no Inu (`.../kimi-ha-harumade-boku-no-inu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Kimi ha Harumade Boku no Inu (`.../kimi-ha-harumade-boku-no-inu`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Dream or Trick (`.../dream-or-trick`) |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Kimi ha Harumade Boku no Inu (`.../kimi-ha-harumade-boku-no-inu`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 4 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | <1s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 48/48 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 48/48 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://yaoiscan.me/.../kimi-ha-harumade-boku-no-inu.jpg` (image/jpeg, 28069 bytes, 245x350) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kimi-ha-harumade-boku-no-inu` |  |  |  |
| details thumbnail URL | PASS | `https://yaoiscan.me/.../kimi-ha-harumade-boku-no-inu.jpg` |  |  |  |
| details author | PASS | Retsujyo |  |  |  |
| details artist | PASS | Retsujyo |  |  |  |
| details genres | PASS | Drama, Romance, School Life, Smut, Yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Misono Benio has it all—good looks, a prestigious family, and a place at the very top of his school’s social hierarchy. As a popular alpha, he’s constantly surrounded by admirers and never short of someone to fool around with.<br><br>The only exception is his classmate Fujinami Ao, an aloof honor student whom Misono assumes is also an alpha. Unlike everyone else, Fujinami has absolutely no interest in sucking up to him.<br><br>But one day after school, Misono comes across Fujinami being attacked by another alpha and discovers the secret he’s been hiding.<br><br>Fujinami is actually an omega.<br><br>Overwhelmed by Fujinami’s heat-induced pheromones and unable to resist his alpha instincts, Misono ends up sleeping with him. Fujinami then turns the situation to his advantage: to keep other alphas away from him, Misono must become his fake boyfriend and his “guard dog” until graduation.<br><br>Alternative names: You're My Dog Until Spring / 君は春までぼくのいぬ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 4 chapters |  |  |  |
| chapter dates | LINT | 1 of 4 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img01.yaoiscan.me/.../001.webp` (image/webp (encoding: lossy), 100544 bytes, 1400x933) |  |  |  |
