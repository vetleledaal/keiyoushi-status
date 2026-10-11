# Extension Validation Report

- Extension: tachiyomi-th.one08read-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangathemesia
- Source ID: 64300093736011954
- Source name: 108Read
- Source language: th
- Selected manga input: popular offset 0: Perfect Half (`.../perfect-half`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Perfect Half (`.../perfect-half`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Everything About Best Friend (`.../everything-about-best-friend`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 20 | The Breeding Game has Become Reality (`.../the-breeding-game-has-become-reality`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | My Girlfriend Has Already Done Teaching (`.../my-girlfriend-has-already-done-teaching`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Perfect Half (`.../perfect-half`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Perfect Half (`.../perfect-half`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 199 | ตอนที่ 1 (`.../perfect-half-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 33 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Perfect Half, URL=`.../perfect-half` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://www.108read.com/.../Perfect-Half-225x300.jpg` (image/jpeg, 20118 bytes, 225x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../perfect-half` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.108read.com/.../Perfect-Half.jpg` (image/jpeg, 56847 bytes, 600x800) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Adult, Drama, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | เมื่อโลกเคยถูกปกครองโดยผู้ชาย เหล่าผู้หญิงเองก็ต้องลุกขึ้นต่อสู้เพื่อความเท่าเทียมและความเสมอภาค และเมื่อเวลาผ่านไป ก็ได้มีการแบ่งแยกดินแดนที่แบ่งแยกออกเป็นทั้งฝั่งผู้หญิงและผู้ชาย การต่อสู้ที่มี “เซ็กซ์” เดิมพัน ใครจะเป็นฝ่ายชนะ… อ่าน Perfect Half ก่อนใครได้ที่ 108read.com นะครับ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 199 chapters |  |  |  |
| chapter dates | PASS | 199 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 33 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.108read.com/.../Upload-Perfect-Half-1-FISLV-108read.jpg` (image/jpeg, 130971 bytes, 720x1164) |  |  |  |
