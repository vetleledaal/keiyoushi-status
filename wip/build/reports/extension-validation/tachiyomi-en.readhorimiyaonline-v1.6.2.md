# Extension Validation Report

- Extension: tachiyomi-en.readhorimiyaonline-v1.6.2
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 29
- Lint: 0
- Warnings: 0
- Skipped: 8
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 855674716623999161
- Source name: Read Horimiya Online
- Source language: en
- Selected manga input: popular offset 0: Horimiya (`<redacted URL #1: manga resource; relative; no scheme>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 1 | Horimiya (`<redacted URL #1: selected resource; relative; no scheme>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Horimiya (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Horimiya (`<redacted URL #1: selected resource; relative; no scheme>`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 147 | Chapter 1 (`.../horimiya-chapter-1`) |  | <1s |
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
| popular listing | PASS | 1 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Horimiya, URL=`/` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | SKIP | Fewer than 2 manga to check |  |  |  |
| manga title and URL | PASS | 2/2 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 2/2 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://w1.read-horimiya.online/.../ezgif-5456f082e26907bf.jpg` (image/jpeg, 80911 bytes, 998x1420) |  |  |  |
| details identity | PASS | Details preserved selected URL `/` |  |  |  |
| details thumbnail URL | PASS | `https://w1.read-horimiya.online/.../ezgif-5456f082e26907bf.jpg` |  |  |  |
| details author | PASS | HERO, Hagiwara Daisuke |  |  |  |
| details artist | PASS | HERO, Hagiwara Daisuke |  |  |  |
| details genres | PASS | Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Written by HERO and illustrated by Daisuke Hagiwara, Horimiya (ホリミヤ) is a Japanese manga series adapted from HERO's original webcomic Hori-san to Miyamura-kun (堀さんと宮村くん). Serialized in Square Enix's Monthly G Fantasy across 16 tankōbon volumes and licensed in English by Yen Press, the story follows the converging lives of high school students Kyouko Hori and Izumi Miyamura. While Hori is admired as a popular, model student, she secretly leads a domestic life taking care of her home and younger brother. Meanwhile, the quiet and gloomy Miyamura hides nine piercings and extensive tattoos under his uniform. When the two accidentally stumble upon each other's secret personas outside of school, their shared confidence blossoms into a deep bond and romance. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 147 chapters |  |  |  |
| chapter dates | PASS | 147 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://laiond.com/.../RiidNIZL797YuA0J2GaTk6lrEAqeTv1787857392.jpg` (image/jpeg, 3574718 bytes, 3709x1600) |  |  |  |
