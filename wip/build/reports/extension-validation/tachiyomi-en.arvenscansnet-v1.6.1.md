# Extension Validation Report

- Extension: tachiyomi-en.arvenscansnet-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 640484333556017983
- Source name: Arven Scans
- Source language: en
- Selected manga input: popular offset 0: Revenge of the Iron-Blooded Sword Hound (`.../edb82d38-ad9e-464d-a0d5-edbb027b15fe`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Revenge of the Iron-Blooded Sword Hound (`.../edb82d38-ad9e-464d-a0d5-edbb027b15fe`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | The Ruler Of Darkness (`.../73c47f1f-9922-4a91-a432-cb04c6b9dc15`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | The Max Level Hero has Returned! (`.../55c52de4-b125-489b-9c3c-0335fe297f4c`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Revenge of the Iron-Blooded Sword Hound (`.../edb82d38-ad9e-464d-a0d5-edbb027b15fe`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Revenge of the Iron-Blooded Sword Hound (`.../edb82d38-ad9e-464d-a0d5-edbb027b15fe`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 189 | Chapter 1 (`.../7bb8d8db-92d6-4a51-a395-7f3701b6c574`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 82 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Revenge of the Iron-Blooded Sword Hound, URL=`edb82d38-ad9e-464d-a0d5-edbb027b15fe` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 69/69 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 69/69 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.arvenscans.net/.../0bd4c73d53a6c02ff1c30933ac33d8e5.webp` (image/webp (encoding: lossy), 435786 bytes, 1080x1457) |  |  |  |
| details identity | PASS | Details preserved selected URL `edb82d38-ad9e-464d-a0d5-edbb027b15fe` |  |  |  |
| details thumbnail URL | PASS | `https://api.arvenscans.net/.../0bd4c73d53a6c02ff1c30933ac33d8e5.webp` |  |  |  |
| details author | PASS | I Stepped On Lego |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Revenge, Regression |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | He was the hound of the Baskerville family: Vikir.Yet his loyalty was rewarded by the blade of a guillotine dirtied by slander."I will never live the life of a hound slaughtered after the rabbit is caught."In place of death, an unexpected opportunity awaits him.Vikir's eyes glowed red as he sharpened his canines in the dark."Just you wait, Hugo. I will rip out your throat this time."It's time for the hound to exact bloody revenge on his owner.<br><br>Alternative titles: عودة الكلب ذي الدم الحديدي · Kuduz Hançerin İntikamı · Die Rückkehr des Jagdhundes aus Eisen und Blut · การกลับมาของหมาล่าเนื้อตระกูลดาบเลือดเหล็ก · Revenge of the Baskerville Bloodhound · Return of the Iron-Blooded Sword Hound · Regression of the Ironblade Hound · La revanche du limier des Baskerville · The Return of the Iron-Blood Sword Hound · Demir Kanlı Kılıç Tazısının İntikamı · La Venganza del Sabueso de Sangre de Hierro · Cheolhyeol Geomga Sanyanggae-ui Hoegwi · La venganza del sabueso de la espada sangrienta · Revenge of the Sword Clan's Hound · 回帰した鉄血の猟犬 · 철혈검가 사냥개의 회귀 · 철혈검가 · The Iron-Blooded Sword Hound's Regression · Iron-Blooded Sword Hound · Return of the Sword Hound · Cheolhyeolgeonga Sanyanggaeui Hoegwi · 鉄血剣華の猟犬 · 铁血剑家猎犬的回归 · Возвращение охотничьей собаки рода Железной Крови · انتقام كلب الصيد ذو الدم الحديدي · Sự Trả Thù Của Chó Săn Máu Sắt · La Revanche du Chien de Chasse à Sang Froid · La Venganza del Perro de Caza de Sangre de Hierro · A Vingança do Cão de Caça de Sangre de Ferro · Balas Dendam Anjing Pemburu Pedang Berdarah Besi |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 189 chapters |  |  |  |
| chapter dates | PASS | 189 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 82 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.arvenscans.net/.../2e5c364ac38540e2c931389b228fab8dab95ce3e71748d967cd0be0d938faea9` (image/webp (encoding: lossy), 260686 bytes, 1200x800) |  |  |  |
