# Extension Validation Report

- Extension: tachiyomi-ja.jumptoon-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2618336401735517644
- Source name: Jump Toon
- Source language: ja
- Selected manga input: popular offset 0: 伝説の暗殺者、転生したら王家の愛され末娘になってしまいまして。 (`.../JT00055`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | 伝説の暗殺者、転生したら王家の愛され末娘になってしまいまして。 (`.../JT00055`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 40 | 異世界コンビニのおっさん、実は最強。 (`.../JT00019`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 伝説の暗殺者、転生したら王家の愛され末娘になってしまいまして。 (`.../JT00055`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 伝説の暗殺者、転生したら王家の愛され末娘になってしまいまして。 (`.../JT00055`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 128 | 第1話 - トート (`.../8460`) |  | <1s |
| pages | `getPageList(chapter)` | success | 81 |  |  | <1s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 40 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=伝説の暗殺者、転生したら王家の愛され末娘になってしまいまして。, URL=`JT00055` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 72/72 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 72/72 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://assets.jumptoon.com/.../VH1HavKyQmiRxQdmYjemcg.png` (image/png, 1200870 bytes, 720x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `JT00055` |  |  |  |
| details thumbnail URL | PASS | `https://assets.jumptoon.com/.../VH1HavKyQmiRxQdmYjemcg.png` |  |  |  |
| details author | PASS | 白井ごはん, くぼ（Trys）, 霧梟（Trys）, paoko（Trys）, まるのまる(Trys), やきにく(Trys), こいめハイボール（Trys） |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 青年, バトル・アクション, ファンタジー・SF |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 「バブバ、バブバブバブバブ!?」<br>（わたし、赤ちゃんになってる!?）<br><br>裏社会で伝説として語られる暗殺者・トートは、幼い頃に親に売られ暗殺者として厳しく育てられたため家族の愛を知らない。そんな彼女は気まぐれに猫を助けて死ぬが、死んだのち多くの人命を奪った罪で地獄に落とされかける。しかし猫を助けたという一点の善行から転生を許され、王国の姫・パトリシアとして生まれ変わることに。そして神から、その王家の人々――家族を救うことを命じられてしまう。<br>無力な赤ん坊に生まれ変わったはずだったが、暗殺者スキルは衰えておらず、次々と暗殺者を撃退していく。<br><br>次第に、家族というただそれだけの理由で自分のことを無条件に愛してくれる、王家の人々……家族のことを守りたいという気持ちが芽生えていき――？<br><br><br>©ストレートエッジ／集英社 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 81 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://contents.jumptoon.com/.../8d612f9e91a62e7a37be625859f153ee541298ef97b42a377bd471de356f3021.webp <redacted query values: bit, expiration, and signature>` (image/webp (encoding: lossy), 58070 bytes, 760x1000) |  |  |  |
