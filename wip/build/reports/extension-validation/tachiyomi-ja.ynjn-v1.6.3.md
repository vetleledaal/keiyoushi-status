# Extension Validation Report

- Extension: tachiyomi-ja.ynjn-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3322701627784242064
- Source name: Young Jump+
- Source language: ja
- Selected manga input: popular offset 0: 釣って食べたいギャル澤さん (`.../15313`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 釣って食べたいギャル澤さん (`.../15313`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 10 | ゴールデンエッグ (`.../9009`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 釣って食べたいギャル澤さん (`.../15313`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 釣って食べたいギャル澤さん (`.../15313`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 31 | 1流し目 ギャルとタイラバ (`.../235559`) |  | <1s |
| pages | `getPageList(chapter)` | success | 60 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=釣って食べたいギャル澤さん, URL=`15313` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://public.ynjn.jp/.../thumbnail_tsuttetabetai_2611.png` (image/png, 133618 bytes, 501x501) |  |  |  |
| details identity | PASS | Details preserved selected URL `15313` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://public.ynjn.jp/.../08X10000000074719100_cover_0.jpg` (image/jpeg, 1098051 bytes, 1440x2048; server Content-Type: application/octet-stream) |  |  |  |
| details author | PASS | ふなつかずき |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | お色気, コメディ |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 釣り…!!!　たのしーーっ!!!　社会人3年目・釣谷一尋の休日の楽しみは、大海原でひとり心穏やかに釣りをすること――だったが…「おにーさん教えてよ！」　ある日、釣り船で出会ったハイテンションギャル・春澤祭がグイグイ話しかけてきて、静かだった船上は一気に賑やかに!!　さらに、タイ釣り中のハプニングにより弱みを握られてしまった釣谷くんは、“ギャル澤さん”に魚の捌き方や料理を教える約束をさせられてしまい…!?　美味しい魚料理と、相性抜群のお酒も必見!!　爆釣必至の入れ食い釣りグルメコメディ、開幕!!【※アプリ配信用に一部修正を入れております】 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 31 chapters |  |  |  |
| chapter dates | LINT | All 31 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=31 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 60 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://public.ynjn.jp/.../20240702142519_003.webp` (image/jpeg, 353260 bytes, 840x1200; server Content-Type: binary/octet-stream) |  |  |  |
