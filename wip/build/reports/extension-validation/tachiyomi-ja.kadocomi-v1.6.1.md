# Extension Validation Report

- Extension: tachiyomi-ja.kadocomi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8396089563187142394
- Source name: カドコミ
- Source language: ja
- Selected manga input: popular offset 0: アイアンマン -アイ・アム・アイアンマン- ｜The Manga (`.../KC_021312_S`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | アイアンマン -アイ・アム・アイアンマン- ｜The Manga (`.../KC_021312_S`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | ただのコスプレイヤーなので聖女は辞めてもいいですか？ (`.../KC_000190_S`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | お前の作る飯が食いたいんだけど。 (`.../KC_020396_S`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | 気合を入れろ！西山！ (`.../KC_021433_S`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | アイアンマン -アイ・アム・アイアンマン- ｜The Manga (`.../KC_021312_S`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | アイアンマン -アイ・アム・アイアンマン- ｜The Manga (`.../KC_021312_S`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 第1話-1 (`.../01a11e36-9a0c-7fb1-b27c-bc4e921437cc`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=アイアンマン -アイ・アム・アイアンマン- ｜The Manga, URL=`.../KC_021312_S` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.comic-walker.com/.../232d7fec-f89f-4e56-9eca-6d3d944a6aa7.jpg` (image/jpeg, 156478 bytes, 960x540; server Content-Type: binary/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../KC_021312_S` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.comic-walker.com/.../232d7fec-f89f-4e56-9eca-6d3d944a6aa7.jpg` |  |  |  |
| details author | PASS | TERU |  |  |  |
| details artist | PASS | TERU |  |  |  |
| details genres | PASS | 少年, バトル・アクション, コミカライズ, 大人向け, カッコいい, 冒険, スカッとする, アツい, クセになる, ミリタリー, 戦士, 死に戻り, おじさん, メカ |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 軍事兵器会社の社長であり自身も科学者であるトニー・スターク。アフガニスタンで自社兵器のでも実験に参加した彼は、テロ組織に襲われてしまいーー。<br><br>Next Update: 2026/10/23 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.comic-walker.com/.../1_6693eae894d0a10435d2802c21f97fd4181692b85fc1802bbaadd1369afad953.webp <redacted query values: Policy, Signature, and Key-Pair-Id>` (image/webp (container: extended), 413216 bytes, 1284x1826; server Content-Type: application/octet-stream) |  |  |  |
