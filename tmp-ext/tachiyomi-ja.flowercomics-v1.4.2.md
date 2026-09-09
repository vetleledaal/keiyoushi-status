# Extension Validation Report

- Extension: tachiyomi-ja.flowercomics-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6525907185900913523
- Source name: Flower Comics
- Source language: ja
- Selected manga input: popular offset 0: 僕の初恋をキミに捧ぐ (`.../5947`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | 僕の初恋をキミに捧ぐ (`.../5947`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 55 | 極と蕾～極道と恋を知らない人妻と～ (`.../1181`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 僕の初恋をキミに捧ぐ (`.../5947`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 僕の初恋をキミに捧ぐ (`.../5947`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 137 | 1st fortune -1未来 (`.../133324`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 17 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 55 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=僕の初恋をキミに捧ぐ, URL=`5947` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 76/76 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 76/76 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.flowercomics.jp/.../5947.webp <redacted query values: h and e>` (image/webp (encoding: lossy), 111106 bytes, 1920x1440) |  |  |  |
| details identity | PASS | Details preserved selected URL `5947` |  |  |  |
| details thumbnail URL | PASS | `https://img.flowercomics.jp/.../5947.webp <redacted query values: h and e>` |  |  |  |
| details author | PASS | 青木琴美 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 恋愛, メディア化, 感動, 切ない, ヒューマンドラマ, 完結, Ｓｈｏ－Ｃｏｍｉ |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ”僕は幸せだった　繭が好きで好きで　毎日毎日どんどん好きになってく　だって知らなかったんだ…　好きになっちゃいけないって　好きになっても無駄だって…　8歳の夏　僕は最低な約束をした。” 心臓病で入院している逞（たくま）と逞の主治医の娘・繭（まゆ）はとても仲がよく、いつも逞の病室で遊んでいた。ある日、繭は逞が「二十歳まで生きられない」と両親が話しているのを耳にしてしまう。逞の運命を知った繭は、なんとか逞の病気を治そうとする。そして、逞は自分の運命を知らないまま、繭に「大人になったら結婚してくれる？」と告げるのだが…！？映像化超ヒット、胸打つ純愛ストーリー。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 137 chapters |  |  |  |
| chapter dates | PASS | 137 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 17 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.flowercomics.jp/.../1.webp.enc <redacted query values: h and e>` (image/webp (encoding: lossy), 95790 bytes, 766x1200; server Content-Type: application/octet-stream) |  |  |  |
