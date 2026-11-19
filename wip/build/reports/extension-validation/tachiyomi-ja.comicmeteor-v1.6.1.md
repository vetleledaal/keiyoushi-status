# Extension Validation Report

- Extension: tachiyomi-ja.comicmeteor-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 1
- Warnings: 0
- Skipped: 7
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7760875295931980663
- Source name: Kiraboshi
- Source language: ja
- Selected manga input: popular offset 0: 救国の騎士は猛毒姫に愛を捧ぐ (`.../moudokuhime`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 760 | 救国の騎士は猛毒姫に愛を捧ぐ (`.../moudokuhime`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 救国の騎士は猛毒姫に愛を捧ぐ (`.../moudokuhime`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 救国の騎士は猛毒姫に愛を捧ぐ (`.../moudokuhime`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | 読み切り (`.../2023381`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 760 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=救国の騎士は猛毒姫に愛を捧ぐ, URL=`.../moudokuhime` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 761/761 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 761/761 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://kirapo.jp/.../thumbnail_3b98336640244833.avif` (image/avif (format: avif), 44203 bytes, 300x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../moudokuhime` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | 漫画：香月心 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界・ファンタジー, 異世界・令嬢, イケメン |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「この想いは猛毒か、純愛か――」猛毒体質によって追放された元第二王女・エリシアのもとに、国の英雄・クロルドが王命の婚姻届けをもってやってくる。体質の危険性から婚約破棄を願い出るエリシアだが、クロルドに毒の耐性があることを理由に却下され結婚することに。しかし、“猛毒耐性”にはとある裏があり――。愛が重すぎる救国の騎士×追放された王女の激愛ラブコメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://kirapo.jp/.../0001.ptimg.json` (image/jpeg, 622834 bytes, 1131x1609) |  |  |  |
