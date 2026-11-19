# Extension Validation Report

- Extension: tachiyomi-all.pixiv-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 4964829535501435742
- Source name: Pixiv
- Source language: en
- Selected manga input: latest offset 0: キノコの解放戦線 (`.../160720`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | バ美肉おじいちゃん (`.../239846`) |  | 10s+ |
| popular_next | `getPopularManga(2)` | success | 50 | ミクウナ四コマです。 (`.../152216098`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | キノコの解放戦線 (`.../160720`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | かわいいもの好きな大団長とふわふわな妖精さん (`.../343059`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 3 | コラボ企画　キノコの解放戦線VS公安警察 (`.../141549351`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | キノコの解放戦線 (`.../160720`) |  | 10s+ |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 228 | キノコの解放戦線　第１～６話 (`.../99902663`) |  | <1s |
| pages | `getPageList(chapter)` | success | 3 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=キノコの解放戦線, URL=`.../160720` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 203/203 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 203/203 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.pximg.net/.../152265531_p0_master1200.jpg` (image/png, 73465 bytes, 782x410) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../160720` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; Thumbnail URL `https://i.pximg.net/.../eGSh6qC9UqNun5XtArn9Ygsfy1IH6Anf.png` was not downloaded |  |  |  |
| details author | PASS | createrolerole |  |  |  |
| details artist | PASS | createrolerole |  |  |  |
| details genres | PASS | 漫画, オリジナル, 4コマ, きのこ, 日常, ギャグ, コメディ, 女の子, 青春, リザードン, チコリータ, AI, よその子, ファンタジー, 安室透, 桜, 白雪姫, 神回, 終末のワルキューレ, バイオハザード, 昔話, 記念作品, 転スラ, バトル, ハンターハンター, 異能力, プッチ神父, ジョジョ, アイビスペイント, クロロ=ルシルフル, 四天王, お盆, 線香花火, ティンカーベル, アンパンマン, 最終回, あとがき, ラピュタ, 裏ボス, 天翔龍閃, 描かせていただきました, ミステリー, キノコ, 親子, スカルミリョーネ, ゴブリン, エッセイ, テレワーク, ホラー, ポケモン, スプラトゥーン, なん・・・だと・・・?, そうはならんやろ, 王蟲, ポプテピピック, 新札, デスゲーム, クイズ, 算数, SF, ピアニスト, 自転車, 忍者, 戦闘機, 戦国, 振り返り, 妖怪, マフェット, アンダーテール, 餅, 視力検査, バレンタイン2024, 生物, 地球, 歴史, 古生代, 中生代, 恐竜, 大晦日, お正月, 新年, 太古, 原生生物, スノーボールアース, 全球凍結, 学習, 白髭, 海賊, 家事, ダブスタ, 進次郎構文, 警察, 天使, 誘拐犯, オタク, SNS, やさしい世界, 黒服, ハロウィン, 紅葉狩り, きのこ狩り, カップ麺, 秋, 食欲の秋, 台無し, スーパーキノコ, 女心と秋の空, レモン, レモングラス, 電車, 悪役, お題, 三角形, 三角関係, 学校, 浜崎あゆみ, 釣り, 敬老の日, 海苔, プロセス, うんこ製造機, エレベーター, オペ, 疑問, 惑星, 天王星, 海王星, 宇宙, 土星, 火星, 木星, 金星, 水星, 絵描き, 七夕, 七夕2023, 三角食べ, 黒猫, 縁起, 父の日, 野球, 名探偵コナン, 目暮十三, PAPUWA, 空気遠近法, カレー, ミンティア, 母の日, キャプテン翼, こどもの日, 海賊団, ことわざ, 焼肉, ペット, 地獄, エイプリルフール, お花見, フライトアテンダント, パリピ, 決断, 飛行機, バイト, ホワイトデー, ホワイトデー2023, 4コマ漫画, 雛祭り, ラテアート, ギャグ漫画, 納豆, 静電気, ラーメン, Twitter, 玉ねぎ, 環境問題, 風邪, 5億年ボタン, バレンタイン, バレンタイン2022, 節分, アレクサ, 名探偵, ピカチュウ, ネタ, 募集, 名前, スターウォーズ, 範馬刃牙, マナー, 動物園, マッサージ, 取材, 真面目マッサージ, 鬼滅の刃, トイレトレーニング, ふぐ, 再会, 乾燥, 初詣, お正月2023, 四コマ漫画, 名前募集中, 布団, 年の瀬, クリスマス2022, ヨーグルト, 進撃の巨人, 北斗の拳, 漫画家, 遊園地, お化け屋敷, 観覧車, ディズニーシー, ジェットコースター, ビニールハウス, コーヒーカップ, 経済, 生命, カレンダー, 恋, 能力者, 夢オチ, バトル漫画, 異能バトル, ギャップ, ザ・ワールド, 能力バトル, ゲーム, 英語, カラー, ガシャポン, ゴミ, ティウンティウン, 孔明, マリオメーカー, キャラ, 川の字, 菌, ブランド, 研修生, 悩み, ソウル, 歯医者, 恋愛, シンクロ, ジョーク, コロナ, 帰省, 自律神経失調症, 倍返し, 赤ちゃん, 中二病, 物忘れ, 夕暮れ, 椅子, みそ汁, テスト, 水分補給, ニッチ, えのき, ジャンケン, いねえよなぁ, 将棋, RPG, 料理, 早口言葉 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 仲間のキノコたちを解放するべく日々活動する<br>キノコが主人公のドタバタなギャグ漫画です。<br><br>Amazonで無料でシリーズ別に一気読み！<br>https://x.gd/.../ycjJT |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 228 chapters |  |  |  |
| chapter dates | PASS | 228 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 3 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.pximg.net/.../99902663_p0.png` (image/png, 175476 bytes, 768x1024) |  |  |  |
