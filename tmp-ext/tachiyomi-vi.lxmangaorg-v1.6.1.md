# Extension Validation Report

- Extension: tachiyomi-vi.lxmangaorg-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2252098186268656747
- Source name: LxManga.org (unoriginal)
- Source language: vi
- Selected manga input: popular offset 0: Dục Vọng Tội Lỗi (`.../duc-vong-toi-loi.html`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Dục Vọng Tội Lỗi (`.../duc-vong-toi-loi.html`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | [raikage] – Hồi Ký Ntr Của Ninja (`.../raikage-hoi-ky-ntr-cua-ninja.html`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 18 | Soeun (`.../soeun.html`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 18 | [vũ Trụ 2] Người Mẹ Dâm Đãng – Bắt Mẹ (`.../vu-tru-2-nguoi-me-dam-dang-bat-me.html`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dục Vọng Tội Lỗi (`.../duc-vong-toi-loi.html`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dục Vọng Tội Lỗi (`.../duc-vong-toi-loi.html`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 15 | Lizana và Người Vô Gia  (`.../lizana-va-nguoi-vo-gia-cu-part-1.html`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dục Vọng Tội Lỗi, URL=`.../duc-vong-toi-loi.html` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 73/73 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 73/73 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://lxmanga.org/.../duc-vong-toi-loi.avif` (image/avif (format: avif), 13889 bytes, 250x331) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../duc-vong-toi-loi.html` |  |  |  |
| details thumbnail URL | PASS | `https://lxmanga.org/.../duc-vong-toi-loi.avif` |  |  |  |
| details author | PASS | Zetto |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Có Che, Hentai Màu, Truyện Con Trai, Truyện Tranh 18+, Chơi Hai Lỗ, Cốt Truyện, Hãm Hiếp, Hậu Môn, Housewife, Loạn Luân, Lxhentai, Mind Control, Ngực Lớn, Ntr, Nhật Bản |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name |  |  |  |
| chapters | PASS | 15 chapters |  |  |  |
| chapter dates | LINT | All 15 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=15 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn2.tymanga.com/.../0-68960d264cd31.jpg` (image/jpeg, 224210 bytes, 1352x1802) |  |  |  |
