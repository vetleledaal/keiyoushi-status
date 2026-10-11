# Extension Validation Report

- Extension: tachiyomi-en.cmanhua-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7460126106933105633
- Source name: CManhua
- Source language: zh
- Selected manga input: popular offset 0: 贵妃今天也要以身饲敌 (`.../guifeijintianyeyaoyishensidi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | 贵妃今天也要以身饲敌 (`.../guifeijintianyeyaoyishensidi`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 12 | 魍魉之花 (`.../wangliangzhihua`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 12 | 贵妃今天也要以身饲敌 (`.../guifeijintianyeyaoyishensidi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 12 | 开局奖励一亿条命 (`.../kaijujiangliyiyitiaoming`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 贵妃今天也要以身饲敌 (`.../guifeijintianyeyaoyishensidi`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 贵妃今天也要以身饲敌 (`.../guifeijintianyeyaoyishensidi`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 48 | Chapter 1: 贵妃今天也要以身饲敌 - 12月24日 爆更上线 (`.../69d4da7e31105888517dfb58`) |  | <1s |
| pages | `getPageList(chapter)` | success | 12 |  |  | 1-10s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=贵妃今天也要以身饲敌, URL=`guifeijintianyeyaoyishensidi` |  |  |  |
| latest differs from popular | LINT | Latest page 1 exactly matches popular page 1; verify supportsLatest |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=魍魉之花, URL=`wangliangzhihua` at page 1 offset 5 and page 2 offset 0, title=荆棘女王, URL=`jingjinvwang` at page 1 offset 6 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cmanhua.com/.../cover.webp` (image/jpeg, 81840 bytes, 600x799; server Content-Type: image/webp) |  |  |  |
| details identity | PASS | Details preserved selected URL `guifeijintianyeyaoyishensidi` |  |  |  |
| details thumbnail URL | PASS | `https://cmanhua.com/.../cover.webp` |  |  |  |
| details author | PASS | Fire工作室, 白三文化, 顾我 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 【娇蛮没头脑】X【闷骚不高兴】“我与死对头身体互换，然后发现她身怀六甲？！”被迫替宁贵人带球跑的乔贵妃，每天都在气冲冲。更离谱的是：这阴险狡诈的贵人，竟然暗恋本宫？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 48 chapters |  |  |  |
| chapter dates | PASS | 48 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 12 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://manhua.5um.net/.../0bea03f52e36b7f7fd93820d5ce604dd.webp` (image/jpeg, 237581 bytes, 900x1976; server Content-Type: image/webp) |  |  |  |
